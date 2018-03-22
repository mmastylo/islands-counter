package mm.test.islands;

public class IslandsCounter {

	public int count(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			throw new IllegalArgumentException();
		}

		int rows = matrix.length;
		int cols = matrix[0].length;
		int islands = 0;
		int[] root = new int[rows * cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 1) {
					root[i * cols + j] = i * cols + j;
					islands++;
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 1) {
					for (SearchDirection direction : SearchDirection.values()) {
						int x = i + direction.getXDelta();
						int y = j + direction.getYDelta();

						if (x >= 0 && x < rows && y >= 0 && y < cols && matrix[x][y] == 1) {
							int currentRoot = getRoot(root, i * cols + j);
							int nextRoot = getRoot(root, x * cols + y);

							if (nextRoot != currentRoot) {
								root[currentRoot] = nextRoot;
								islands--;
							}
						}
					}
				}
			}
		}

		return islands;
	}

	public int getRoot(int[] array, int value) {
		while (array[value] != value) {
			value = array[array[value]];
		}

		return value;
	}

}
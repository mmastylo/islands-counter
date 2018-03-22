package mm.test.islands;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatrixFixture {

	public static int[][] nullMatrix() {
		return null;
	}

	public static int[][] emptyMatrix() {
		return new int[0][];
	}

	public static int[][] emptyRowsMatrix() {
		return new int[][] { {}, {}, {} };
	}

	public static int[][] fourIslandsMatrix() {
		return new int[][] { //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 1, 1, 1, 0, 0, 0, 1, 0, 0 }, //
				{ 1, 1, 0, 0, 0, 1, 1, 1, 0 }, //
				{ 0, 0, 0, 0, 0, 1, 1, 0, 0 }, //
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0 }, //
				{ 1, 1, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 1, 1, 0, 0 } //
		};
	}

	public static int[][] cornerIslandsMatrix() {
		return new int[][] { //
				{ 1, 0, 0, 0, 0, 0, 0, 0, 1 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
				{ 1, 0, 0, 0, 0, 0, 0, 0, 1 } //
		};
	}

	public static int[][] largeMatrix(int size) {
		int matrix[][] = new int[size][size];
		IntStream.range(0, size).forEach(x -> Arrays.setAll(matrix[x], y -> (int) Math.round(Math.random())));

		return matrix;
	}

}
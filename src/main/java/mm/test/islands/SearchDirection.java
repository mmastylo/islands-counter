package mm.test.islands;

public enum SearchDirection {

	NW(-1, -1), N(0, -1), NE(-1, 1), E(0, 1), SE(1, 1), S(1, 0), SW(1, -1), W(-1, 0);

	private int deltaX;

	private int deltaY;

	private SearchDirection(int deltaX, int deltaY) {
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}

	public int getXDelta() {
		return deltaX;
	}

	public int getYDelta() {
		return deltaY;
	}

}
package mm.test.islands;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test.None;

public class IslandsCounterTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenGivenNull() {
		// given
		IslandsCounter islandsCounter = new IslandsCounter();
		int[][] matrix = MatrixFixture.nullMatrix();

		// when
		islandsCounter.count(matrix);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenGivenEmptyMatrix() {
		// given
		IslandsCounter islandsCounter = new IslandsCounter();
		int[][] matrix = MatrixFixture.emptyMatrix();

		// when
		islandsCounter.count(matrix);
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenGivenEmptyRows() {
		// given
		IslandsCounter islandsCounter = new IslandsCounter();
		int[][] matrix = MatrixFixture.emptyRowsMatrix();

		// when
		islandsCounter.count(matrix);
	}

	@Test
	public void shouldCountFourIslands() {
		// given
		int correctResult = 4;
		IslandsCounter islandsCounter = new IslandsCounter();
		int[][] matrix = MatrixFixture.fourIslandsMatrix();

		// when
		int islands = islandsCounter.count(matrix);

		// then
		assertEquals(islands, correctResult);
	}

	@Test
	public void shouldCountCornerIslands() {
		// given
		int correctResult = 4;
		IslandsCounter islandsCounter = new IslandsCounter();
		int[][] matrix = MatrixFixture.cornerIslandsMatrix();

		// when
		int islands = islandsCounter.count(matrix);

		// then
		assertEquals(islands, correctResult);
	}

	@Test(expected = None.class)
	public void shouldNotThrowStackOverflowExceptionWhenGivenLargeMatrix() {
		// given
		int martixSize = 1000;
		IslandsCounter islandsCounter = new IslandsCounter();
		int[][] matrix = MatrixFixture.largeMatrix(martixSize);

		// when
		islandsCounter.count(matrix);
	}

}
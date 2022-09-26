package com.fbaa.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordSearchTest {

	char[][] board = new char[][] { //
			{ 'A', 'B', 'C', 'E' }, //
			{ 'S', 'F', 'C', 'S' }, //
			{ 'A', 'D', 'E', 'E' } };

	@Test
	public void search_ABCCED() {
		WordSearch solution = new WordSearch(board, "ABCCED");
		Boolean result = solution.search();
		assertTrue("The word ABCCED should be in the board.", result);
	}

	@Test
	public void search_SEE() {
		WordSearch solution = new WordSearch(board, "SEE");
		Boolean result = solution.search();
		assertTrue("The word SEE should be in the board.", result);
	}

	@Test
	public void search_ABCB() {
		WordSearch solution = new WordSearch(board, "ABCB");
		Boolean result = solution.search();
		assertFalse("The word ABCCED should NOT be in the board.", result);
	}
}

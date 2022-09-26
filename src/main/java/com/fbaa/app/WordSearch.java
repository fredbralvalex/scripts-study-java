package com.fbaa.app;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {

	public class Tuple {
		int x;
		int y;

		public Tuple(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public boolean equals(Object o) {
			if (o == null) {
				return false;
			}
			if (!(o instanceof Tuple)) {
				return false;
			}
			Tuple tuple = (Tuple)o;
			return tuple.x == x && tuple.y == y;
		}
	}

	char[][] board;
	String word;

	public WordSearch(char[][] board, String word) {
		this.board = board;
		this.word = word;
	}

	public Boolean search() {
		if (word == null) {
			return false;
		}

		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				if (board[x][y] == word.charAt(0)) {
					if (deepFirstSearch(new Tuple(x, y), new ArrayList<Tuple>(), word, 0)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private Boolean deepFirstSearch(Tuple position, List<Tuple> visitedPosition, String word, int index) {

		if (index >= word.length() - 1) {
			return true;
		}

		int x = position.x;
		int y = position.y;

		Tuple[] possibleMoves = new Tuple[] { new Tuple(x + 1, y), new Tuple(x - 1, y), new Tuple(x, y + 1),
				new Tuple(x, y - 1) };
		int maxX = board.length;
		int maxY = board[0].length;

		for (int i = 0; i < possibleMoves.length; i++) {
			int moveX = possibleMoves[i].x;
			int moveY = possibleMoves[i].y;
			if (moveX >= 0 && moveX < maxX && moveY >= 0 && moveY < maxY) {
				if (board[moveX][moveY] == word.charAt(index + 1)) {
					Tuple nextMove = new Tuple(moveX, moveY);
					if (!visitedPosition.contains(nextMove)) {
						visitedPosition.add(nextMove);
						if (deepFirstSearch(nextMove, visitedPosition, word, index + 1)) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}
}

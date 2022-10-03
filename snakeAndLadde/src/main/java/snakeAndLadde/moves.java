package snakeAndLadde;

public class moves extends BoardOperations {
	static int top;
	static int left;
	static int score;
	int flag = 0;

	public moves() {
	}

	public moves(int top, int left, int score) {
		moves.top = top;
		moves.left = left;
		moves.score = score;
	}

	public String top(int score) {
		if (score % 10 == 0) {
			top -= (40);
			return "true";
		}
//		
		return "false";
	}

	public String left(int score) {
		if ((score) / 10 % 2 != 0) {

			if (left >= -10)
				left -= (40);
			else
				left = 10;

			return "true";
		}
		return "false";
	}
//	

	public String right(int score) {
		if (((score) / 10) % 2 == 0) {
			left += (40);
			return "true";
		}
		return "false";
	}

	public String isSnakeOrLadderMove(int score) {
		if (snakeCoordinates.containsKey(score) && flag == 0) {
			top = snakeCoordinates.get((score)).get(1);
			left = snakeCoordinates.get((score)).get(0);
			score = snake.get(score);
			return "0";
		} else if (ladderCoordinates.containsKey(score) && flag == 0) {
			top = ladderCoordinates.get((score)).get(1);
			left = ladderCoordinates.get((score)).get(0);
			score = ladder.get(score);
			return "0";
		}
		flag++;
		return "";
	}
}

package snakeAndLadde;

import java.io.PrintWriter;

import org.apache.catalina.Contained;

public class Functions extends BoardOperations {

	public void moves1(int diceValue, PrintWriter out) {
		out.println("<h1>player1</h1>");

		if (snake.containsKey(player1Score + diceValue)) {
			player1Score = snake.get(player1Score + diceValue);
			out.println("<h1>It's a snake " + player1Score + "</h1>");
		} else if (ladder.containsKey(player1Score + diceValue)) {
			player1Score = ladder.get(player1Score + diceValue);

			out.println("<h1>climb the ladder " + player1Score + "</h1>");
		} else {
			player1Score += diceValue;
			out.println("<h1>else " + player1Score + "</h1>");
		}

	}

	public void moves2(int diceValue, PrintWriter out) {
		out.println("<h1>player2</h1>");

		if (snake.containsKey(player2Score + diceValue)) {
			player2Score = snake.get(player2Score + diceValue);
			out.println("<h1>It's a snake " + player2Score + "</h1>");
		} else if (ladder.containsKey(player2Score + diceValue)) {
			player2Score = ladder.get(player2Score + diceValue);
			out.println("<h1>climb the ladder " + player2Score + "</h1>");
		} else {
			player2Score += diceValue;
			out.println("<h1>else " + player2Score + "</h1>");
		}

	}

}

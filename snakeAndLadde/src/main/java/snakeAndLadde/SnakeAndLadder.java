package snakeAndLadde;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.apache.catalina.tribes.util.Arrays;
import org.eclipse.jdt.internal.compiler.parser.Scanner;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class BoardOperations {
	static int winScore = 100;
	static int player1Score = 1;
	static int player2Score = 1;
	int dflag = 0;
//	Scanner sc = new Scanner(System.in);
	static HashMap<Integer, Integer> snake = new HashMap<>();
	static HashMap<Integer, Integer> ladder = new HashMap<>();
	static HashMap<Integer, ArrayList<Integer>> snakeCoordinates = new HashMap<>();
	static HashMap<Integer, ArrayList<Integer>> ladderCoordinates = new HashMap<>();

	{
		snake.put(37, 3);
		snake.put(47, 16);
		snake.put(28, 10);
		snake.put(75, 32);
		snake.put(94, 71);
		snake.put(96, 42);
		snakeCoordinates.put(37, new ArrayList(Arrays.asList(85, 10)));
		snakeCoordinates.put(47, new ArrayList(Arrays.asList(165, -30)));
		snakeCoordinates.put(28, new ArrayList(Arrays.asList(360, 0)));
		snakeCoordinates.put(75, new ArrayList(Arrays.asList(330, -110)));
		snakeCoordinates.put(94, new ArrayList(Arrays.asList(360, -270)));
		snakeCoordinates.put(96, new ArrayList(Arrays.asList(45, -150)));// 40px

		ladder.put(4, 56);
		ladder.put(14, 55);
		ladder.put(12, 50);
		ladder.put(41, 79);
		ladder.put(22, 58);
		ladder.put(54, 88);
		ladderCoordinates.put(4, new ArrayList(Arrays.asList(165, -190)));
		ladderCoordinates.put(14, new ArrayList(Arrays.asList(205, -190)));
		ladderCoordinates.put(12, new ArrayList(Arrays.asList(360, -150)));
		ladderCoordinates.put(41, new ArrayList(Arrays.asList(40, -270)));
		ladderCoordinates.put(22, new ArrayList(Arrays.asList(80, -190)));
		ladderCoordinates.put(54, new ArrayList(Arrays.asList(280, -310)));

	}

	public int diceValue() {
		Random diceVal = new Random();
		if (dflag++ == 0) {
			return 0;
		} else {
			int diceValue = diceVal.nextInt(1, 7);
//		int diceValue = sc.nextInt();
			return diceValue;
		}
	}
}

public class SnakeAndLadder extends
HttpServlet {
	Functions obj = new Functions();
	static int count = 1;
	static boolean isWin = false;
	static boolean player1Wins = false;
	static boolean player2Wins = false;
	PrintWriter out;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String start = req.getParameter("submit");

		out = res.getWriter();

		if (player1Wins)
			out.println("<h1>" + "player1 wins" + "</h1>");
		if (player2Wins)
			out.println("<h1>" + "player2 wins" + "</h1>");

		int dice = obj.diceValue();

		if (!isWin) {
			if (count % 2 == 0) {
				test1 html = new test1(dice, BoardOperations.player1Score);
				if (BoardOperations.player1Score + dice <= 100) {
					out.println(html.prints());
					out.println("<h1>" + "Dice : " + dice + "</h1>");
					obj.moves1(dice, out);

					if (dice != 6 && dice != 1)
						count++;
					if (BoardOperations.player1Score == 100) {
						player1Wins = true;
						isWin = true;
					}
				} else {
					out.println(html.prints());
					out.println("<h1>" + "Dice : " + dice + "</h1>");
					out.println("<h1>out of moves for player 1 " + dice + "</h1>");
					count++;
				}
			} else {
				test2 html2 = new test2(dice, BoardOperations.player2Score);

				if (BoardOperations.player2Score + dice <= 100) {
					out.println(html2.prints());
					out.println("<h1>" + "Dice : " + dice + "</h1>");
					obj.moves2(dice, out);
					if (dice != 6 && dice != 1)
						count++;
					if (BoardOperations.player2Score == 100) {
						player2Wins = true;
						isWin = true;
					}
				} else {

					out.println(html2.prints());
					out.println("<h1>" + "Dice : " + dice + "</h1>");
					out.println("<h1>out of moves for player 2 " + dice + "</h1>");
					count++;
				}
			}
		} else {
			return;
		}

	}
	
}

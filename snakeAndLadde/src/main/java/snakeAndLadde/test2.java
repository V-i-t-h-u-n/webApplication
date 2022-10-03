package snakeAndLadde;

public class test2 extends BoardOperations {
	static int score = 1;
	int dice = 0;
	int flag = 0;
	static int top = 0;
	int temp = top;
	static int left = 10;
	int dflag = 0;

	public test2(int dice, int score) {
		this.dice = dice;
		test2.score = score;

	}

	public String prints() {

		String response = "<!DOCTYPE html>\r\n" + "<html lang=\"en\">\r\n" + "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n" + "    <style>\r\n" + "*{" + "background-color: #cfe3e3;" + "}"
				+ "        #box1{\r\n" + "    width: 30px;\r\n" + "    background-color: red;\r\n"
				+ "    color:green;\r\n" + "    position: absolute;\r\n" + "    top: 370px;\r\n" + "    left: 10px;\r\n"
				+ "}\r\n" + "#box2{\r\n" + "    width: 30px;\r\n" + "    background-color: blue;\r\n"
				+ "    position: absolute;\r\n" + "    top: 368px;\r\n" + "    left: 10px;\r\n" + "}\r\n"
				+ "    </style>\r\n" + "</head>\r\n" + "<body>\r\n"
				+ "    <img src=\"https://www.howtofixx.com/wp-content/uploads/2019/12/Snake-and-Ladder-Template-1.png\" width = \"400px\" alt=\"\">\r\n"
				+ "    <form action=start>\r\n" + "    <input type = submit name = submit value=\"roll\">\r\n"
				+ "    <div id = \"box1\">p1</div>\r\n" + "    <div id = \"box2\">p2</div>\r\n"

				+ "</body>\r\n" + "</html>\r\n";

		response += "<script>" + "var Box1 = document.getElementById(\"box1\");";
		response += "var Box2 = document.getElementById(\"box2\");";
		for (int i = 0; i < dice; i++) {
			if (isSnakeOrLadderMove(score + dice).equals("0")) {
				break;
			}
			if (score + dice <= 100) {
				if (top(score).equals("true")) {
					score++;
				} else if (left(score).equals("true") && score + dice <= 100) {
					score++;
				} else if (right(score).equals("true")) {
					score++;
				}
			}

		}

		response += "Box1.style.transform = \"translate(" + test1.left + "px," + test1.top + "px)\";";
		response += "Box2.style.transform = \"translate(" + left + "px," + top + "px)\";";
		response += "</script>";
		return response;
	}

	public String top(int score) {
		if (score % 10 == 0) {
			top -= (40);

			return "true";
		}

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

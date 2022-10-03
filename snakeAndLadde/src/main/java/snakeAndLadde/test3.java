package snakeAndLadde;

public class test3 extends moves {
	int score1 = 1;
	int score2 = 1;
	int dice = 0;
	int flag = 0;
	int player1Top = 0;
	int player1Left = 10;
	int player2Top = 0;
	int player2Left = 10;
	int count = 0;
	
	public test3(int dice, int count, int score1, int score2) {
//		super(count, score1, score2);
		this.dice = dice;
		this.score1 = score1;
		this.score2 = score2;
		this.count = count;
	}
	moves move = new moves();
	
	public String prints() {
		System.out.println(score1 + " : " + score2 + " : " + dice);
		
		String response = "<!DOCTYPE html>\r\n" + "<html lang=\"en\">\r\n" + "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=devic  e-width, initial-scale=1.0\">\r\n"
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
		if (count % 2 == 0) {
		
			System.out.println("player1 : " + count);
			int[] arr = forLoop(score1);
			player1Top = arr[0];
			player1Left = arr[1];
//					System.out.println("left1 : " + player1Left + " top1 : " + player2Top);

		} else {
			System.out.println("player2 : " + count);
			int[] arr = forLoop(score2);
			player2Top = arr[0];
			player2Left = arr[1];
//					System.out.println("left2 : " + player2Left + " top2 : " + player2Top);
//					response+=
		}
		response += "Box1.style.transform = \"translate(" + player1Left + "px," + player1Top + "px)\";";
		response += "Box2.style.transform = \"translate(" + player2Left + "px," + player2Top + "px)\";";

		response += "</script>";
//		System.out.println("left : " + left + " top : " + top);
		return response;
	}

	private int[] forLoop(int playerScore) {
		// TODO Auto-generated method stub
		for (int i = 0; i < dice; i++) {
			System.out.println("loop");
//			response += "<script>" + "var Box1 = document.getElementById(\""+box+"\");" ;
				if ((move.isSnakeOrLadderMove(playerScore + dice)).equals("0")) break;
				if (playerScore + dice <= 100) {
					if (top(playerScore).equals("true")) playerScore++;
					else if (left(playerScore).equals("true") && playerScore + dice <= 100)	playerScore++;
					else if (right(playerScore).equals("true"))	playerScore++;
				}
			}
		return new int[] {500, 250 };
	}
	
	
	
	
	
	

}

//else if( top(playerScore).equals("true") ){
//response+= "Box1.style.transform = \"translate(" + left + "px," + top + "px)\";" ;
//playerScore++;
//System.out.println("top");
//} 
//else if(left(playerScore).equals("true")){
//response+= "Box1.style.transform = \"translate(" + left + "px," + top + "px)\";" ;
//playerScore++ ;
//System.out.println("left");
//}
//else if(right(playerScore).equals("true")){
//response+= "Box1.style.transform = \"translate(" + left + "px," + top + "px)\";" ;
//playerScore++;
//System.out.println("right");}
//+ "console.log(\"right\");}"
//}
//return response;

//public String top(int score ) {
//if (score % 10 == 0 && score != 0) {
//	top -= (40);
//	System.out.println("top : " + score);
////System.out.println("up");
//	return "true";
//}
////
//return "false";
//}
//
//public String left(int score) {
//if ((score) / 10 % 2 != 0 ) {
//	if(left >= -10)
//	left -= (40);
//	else
//	left = -10;
//	System.out.println("left : " + score);
////System.out.println("left");
//	return "true";
//}
//return "false";
//}
////
//
//public String right(int score) {
//if (((score) / 10) % 2 == 0) {
//	
//	left += (40);
//	System.out.println("right : " + score);
////System.out.println("right");
//	return "true";
//}
////
//return "false";
//}
//
//public String isSnakeOrLadderMove(int score) {
//if (snakeCoordinates.containsKey(score) && flag == 0) {
//	top = snakeCoordinates.get((score)).get(1);
//	left = snakeCoordinates.get((score)).get(0);
////	System.out.println("snake");
//	System.out.println("snake :top " + top + " :left " + left);
//	score = snake.get(score);
//	return "0";
////	break;
//
////	console.log();
//} else if (ladderCoordinates.containsKey(score) && flag == 0) {
//	top = ladderCoordinates.get((score)).get(1);
//	left = ladderCoordinates.get((score)).get(0);
////	System.out.println("ladder");
//	score = ladder.get(score);
//	System.out.println("ladder :top " + top + " :left " + left);
//	return "0";
////	break;
//}
//flag++;
//System.out.println("test");
//return "";
//}

//if (snakeCoordinates.containsKey(playerScore)) {
//	top = snakeCoordinates.get((playerScore)).get(1);
//	left = snakeCoordinates.get((playerScore)).get(0);
////	System.out.println("snake");
//	System.out.println("snake :top " + top + " :left " + left);
////	playerScore = snake.get(playerScore);
////	return "0";
//	flag++;
////	break;
//	return new int[] {top,left};
////	console.log();
//}
//else if (ladderCoordinates.containsKey(playerScore)) {
//	top = ladderCoordinates.get((playerScore)).get(1);
//	left = ladderCoordinates.get((playerScore)).get(0);
////	System.out.println("ladder");
////	playerScore = ladder.get(playerScore);
//	System.out.println("ladder :top " + top + " :left " + left);
////	return "0";
//	flag++;
////	break;
////flag++;
////response+= "Box1.style.transform = \"translate(" + left + "px," + top + "px);";
////System.out.println("snakeorladder");
////break;
//return new int[] {top,left};
//}

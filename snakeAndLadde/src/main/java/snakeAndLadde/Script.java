package snakeAndLadde;

public class Script extends BoardOperations{
	static int stop = 0;
	static int sleft = 10;
	int temp = stop;
	static int playerScore = 0;
	public String prints() {
		String response = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "    <style>\r\n"
				+ "        #box1{\r\n"
				+ "    width: 30px;\r\n"
				+ "    background-color: red;\r\n"
				+ "    color:green;\r\n"
				+ "    position: absolute;\r\n"
				+ "    top: 370px;\r\n"
				+ "    left: 10px;\r\n"
				+ "}\r\n"
				+ "#box2{\r\n"
				+ "    width: 30px;\r\n"
				+ "    background-color: blue;\r\n"
				+ "    position: absolute;\r\n"
				+ "    top: 370px;\r\n"
				+ "    left: 10px;\r\n"
				+ "}\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <img src=\"https://www.howtofixx.com/wp-content/uploads/2019/12/Snake-and-Ladder-Template-1.png\" width = \"400px\" alt=\"\">\r\n"
				+ "    <form action=start>\r\n"
				+ "    <input type = submit name = submit value=\"roll\">\r\n"
				+ "    <div id = \"box1\">p1</div>\r\n"
				+ "    <div id = \"box2\">p2</div>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "<script>"
				+ "var player1Score = "+(BoardOperations.player1Score - BoardOperations.tempDiceValue) +";"
//						+ ""+playerScore+" = player1Score;"
				+ "var top = +"+stop+";"
				+ "var left = "+sleft+";"
				+ "var temp = top;"
				+ "var RedBox = document.getElementById(\"box1\");"
				+ "var dice = "+BoardOperations.tempDiceValue+";"
				+ "for(let i = 1;i<=dice;i++){"
				//+ "console.log(i + player1Score);"
				+ "if("+isSnakeOrLadder()+"){"
						+ "RedBox.style.transform = \"translate("+sleft+"px,"+stop+"px)\";"
//								+ "top = +"+stop+""
						+ "console.log(\"inside if\");"
						+ "}"
						+ "else{"
//						+"RedBox.style.transform = \"translate("+sleft+"px,"+stop+"px)\";\r\n"
						+ "if(parseInt(((player1Score + dice) % 10)) == 0){\r\n"
//								+ "            top -= temp + 40;\r\n"
								+ "        RedBox.style.transform = \"translate("+(sleft)+"px,"+(stop)+"px)\";\r\n"
								+ "		   top -=temp + 40;"
								+ "}\r\n"
								+ "        else if((parseInt((player1Score + dice)/10))%2==0)\r\n"
								+ "        {\r\n"
//								+ "            left+=40;\r\n"
								+ "            RedBox.style.transform = \"translate("+(sleft)+"px,"+(stop)+"px)\";\r\n"
								+ "        left+=40;"
								+ "        }\r\n"
								+ "        else{\r\n"
//								+ "            left-=40;\r\n"
								+ "            RedBox.style.transform = \"translate("+(sleft)+"px,"+(stop)+"px)\";\r\n"
								+ "       left-=40; "
								+ "}\r\n"
								+ "console.log(\"inside else\");"
						+ "player1Score++;"
						
						+ "}"
				+ "}"
				+ "</script>";
				
		
		return response;
		
	}
	public boolean isSnakeOrLadder() {
//		System.out.println( "snake :"+(BoardOperations.player1Score));
//		System.out.println("ladder :"+(BoardOperations.player1Score));
//		System.out.println(snakeCoordinates.containsKey(BoardOperations.player1Score + BoardOperations.tempDiceValue));
//		System.out.println(ladderCoordinates.containsKey(BoardOperations.player1Score  + BoardOperations.tempDiceValue));
		if(snakeCoordinates.containsKey(BoardOperations.player1Score+ BoardOperations.tempDiceValue)) {
							Script.stop = snakeCoordinates.get((BoardOperations.player1Score+ BoardOperations.tempDiceValue)).get(1);
							Script.sleft =	snakeCoordinates.get((BoardOperations.player1Score+ BoardOperations.tempDiceValue)).get(0);
//							System.out.println("snake");
							return true;
//							console.log();
						}
		else if(ladderCoordinates.containsKey(BoardOperations.player1Score)) {
							Script.stop = ladderCoordinates.get((BoardOperations.player1Score+ BoardOperations.tempDiceValue)).get(1);
							Script.sleft = ladderCoordinates.get((BoardOperations.player1Score+ BoardOperations.tempDiceValue)).get(0);
//							System.out.println("ladder");
							return true;
//			console.log(\"ladder\");\r\n"
						}
		return false;
		
}
}

//+ "<script>"
//+ "var player1Score = "+(BoardOperations.player1Score - BoardOperations.tempDiceValue) +";"
////		+ ""+playerScore+" = player1Score;"
//+ "var top = +"+stop+";"
//+ "var left = "+sleft+";"
//+ "var temp = top;"
//+ "var RedBox = document.getElementById(\"box1\");"
//+ "var dice = "+BoardOperations.tempDiceValue+";"
//+ "for(let i = 1;i<=dice;i++){"
////+ "console.log(i + player1Score);"
//+ "if("+isSnakeOrLadder()+"){"
//		+ "RedBox.style.transform = \"translate("+sleft+"px,"+stop+"px)\";"
////				+ "top = +"+stop+""
//		+ "console.log(\"inside if\");"
//		+ "}"
//		+ "else{"
////		+"RedBox.style.transform = \"translate("+sleft+"px,"+stop+"px)\";\r\n"
//		+ "if(parseInt(((player1Score + dice) % 10)) == 0){\r\n"
////				+ "            top -= temp + 40;\r\n"
//				+ "        RedBox.style.transform = \"translate("+(sleft)+"px,"+(stop)+"px)\";\r\n"
//				+ "		   top -=temp + 40;"
//				+ "}\r\n"
//				+ "        else if((parseInt((player1Score + dice)/10))%2==0)\r\n"
//				+ "        {\r\n"
////				+ "            left+=40;\r\n"
//				+ "            RedBox.style.transform = \"translate("+(sleft)+"px,"+(stop)+"px)\";\r\n"
//				+ "        left+=40;"
//				+ "        }\r\n"
//				+ "        else{\r\n"
////				+ "            left-=40;\r\n"
//				+ "            RedBox.style.transform = \"translate("+(sleft)+"px,"+(stop)+"px)\";\r\n"
//				+ "       left-=40; "
//				+ "}\r\n"
//				+ "console.log(\"inside else\");"
//		+ "player1Score++;"
//		
//		+ "}"
//+ "}"
//+ "</script>";
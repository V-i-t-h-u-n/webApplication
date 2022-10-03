package snakeAndLadde;

public class HtmlCode extends BoardOperations{
	static int top = 0;
	static int left = 10;
//	static int right = 10;
//	static int down = 370;
//	static String command1 = "top: 370px;left:10px;";
//	static String command2 = "top: 390px;left:10px;";
	static String response = "";
public String prints() {
	
	response = "<!DOCTYPE html>\r\n"
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
			+ "    top: 368px;\r\n"
			+ "    left: 10px;\r\n"
			+ "}\r\n"
			+ "    </style>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "    <img src=\"https://www.howtofixx.com/wp-content/uploads/2019/12/Snake-and-Ladder-Template-1.png\" width = \"400px\" alt=\"\">\r\n"
			+ "    <form action=start>\r\n"
			+ "    <input type = submit name = submit value=\"roll\">\r\n"
			+ "    <div id = \"box1\">p1</div>\r\n"
//			+ "    <div id = \"box2\">p2</div>\r\n"
			+ "</body>\r\n"
			+ "</html>\r\n"
			+ "<script>\r\n"
			+ "    var player1Score = "+BoardOperations.player1Score+";\r\n"
			+ "    var t = 0;\r\n"
			+ "    var left = 10;\r\n"
			+ "    var temp = t;\r\n"
			+ "    var a = document.getElementById(\"box1\");\r\n"
			+ "    var dice = "+BoardOperations.tempDiceValue+";\r\n"
			+ "		+if("+isSnakeOrLadder()+"){"
//					+ "console.log("")"
					+ "}"
					
					+ "			else {"
			
			+ "		console.log(\"else\");"
			+ "		for(let i = 1;i<=dice;i++){\r\n"
			+ "        if(player1Score % 10 == 0){\r\n"
			+ "            t -= temp + 40;\r\n"
			+ "        a.style.transform = \"translate(\"+left+\"px,\"+(t)+\"px)\";\r\n"
			+ "        }\r\n"
			+ "        else if((parseInt(player1Score/10))%2==0)\r\n"
			+ "        {\r\n"
			+ "            left+=40;\r\n"
			+ "            a.style.transform = \"translate(\"+(left) +\"px,\"+t+\"px)\";\r\n"
			+ "        }\r\n"
			+ "        else{\r\n"
			+ "            left-=40;\r\n"
			+ "            a.style.transform = \"translate(\"+(left) +\"px,\"+t+\"px)\";\r\n"
			+ "        }\r\n"
			+ "        player1Score++;\r\n"
			+ "    }\r\n"
			+ "}\r\n"
			+ "</script>";
			
	
//	 response = "<!DOCTYPE html>";
//	response += "<html>";
////	response += "<head><script console.log(document.getElementsByClassName(\"player1\"));\r\n"
////			+ "</script></head>";
////	response += "<h1>"+"jncdkjnc"+"</h1>";
//	response += "<style> "
//			+ "#box1,#box2{width:30px;position:absolute;"+command1+"background-color:BLUE}"
//			+ "#box2{background-color:RED;"+command2+"}"
////					+ "*{background-color:blue;}"
//			+ "</style>";
//	response += "<body>";
//	response += "<img alt=\"snake\" src=\"https://www.howtofixx.com/wp-content/uploads/2019/12/Snake-and-Ladder-Template-1.png\" width = \"400px\">";
//	response += "<br> <br>";
//	response += "<p id = \"demo\"></p>";
//	response += "<form action=\"start\">";
//	response += "<input type = \"submit\" name = \"submit\" value=\"start\">";
//	response += "<div id = \"box1\">p1</div>";
//	response += "<div id = \"box2\">p2</div>";
//	response += "</body></html>"
//			+ "<script>\r\n"//BoardOperations.player1Score BoardOperations.tempDiceValue
//			+ "    var player1Score = "+BoardOperations.player1Score+";\r\n"
//			+ "    var dice = "+BoardOperations.tempDiceValue+";\r\n"
//			+ "    var t = "+top+";\r\n"
//			+ "    var left = "+left+";\r\n"
//			+ "    var a = document.getElementById(\"box1\");\r\n"
//			
//			+ "for(let i = 1;i<=dice;i++){"
//			+ "if((player1Score + i) <= 10){"
//			+ "a.style.transform = a.style.transform = \"translateX(\"+((player1Score + i)*40)+\"px)\";"
//			+ "}"
//			+ ""
//			+ "}"
//			+ "</script>";
//			
	return response;
}

public boolean isSnakeOrLadder() {
		if(snakeCoordinates.containsKey(tempDiceValue + BoardOperations.player1Score)) {
							top = snakeCoordinates.get((tempDiceValue + BoardOperations.player1Score)).indexOf(1);
							left =	snakeCoordinates.get((tempDiceValue + BoardOperations.player1Score)).indexOf(0);
							return true;
//							console.log(\"snake\");
						}
						else if(ladderCoordinates.containsKey(tempDiceValue + BoardOperations.player1Score)) {
							top = ladderCoordinates.get((tempDiceValue + BoardOperations.player1Score)).indexOf(1);
							left = ladderCoordinates.get((tempDiceValue + BoardOperations.player1Score)).indexOf(0);
							return true;
//			console.log(\"ladder\");\r\n"
						}
		return false;
		
}

//
//public static void player1() {
//	int player1Score = BoardOperations.player1Score;
//	int temp = player1Score;
//	int player1PixelsTop = 370;
//	int player1PixelsLeft = 10;
//	int tempLeft = 10;
//	for(int i = 1;i<=BoardOperations.tempDiceValue;i++) {
//		temp += i;
//		System.out.println(temp);
////		if(temp % 10 == 0) {
////			
////			//top = 
////			//top = "transform: translateX(calc(370px - 50px));";
////			}
//		if(((temp) / 10) % 2 == 0) {
//			//move right
////			right(temp);
//			command1 = 	
//			response = "#player1,#player2{width:30px;position:absolute;"+command1+"background-color:BLUE}";
////			System.out.println(left);
//		}
//		else {
//			//move left
//		}
//	}
//	
//	
//}
//private static  void right(int temp) {
//
//	left += 30;
////	String right = "";
////	int rightt = 10;
////	rightt += 30;
////	right = "right:"+rightt+"px;";
////	command1 = right;
//}
//public static void player2() {
//	int player2Score = BoardOperations.player2Score;
//}

//+ "        if((player1Score + i) % 10 == 0 && (player1Score + i) >= 10){\r\n"
//+ "            t = t - 30;\r\n"
//+ "            console.log(\"top : \"+t);\r\n"
//+ "            a.style.transform = \"translate(\"+left+\"px,\"+ top+\"px);\"}//top\r\n"
//+ "        else if((player1Score + i / 10) % 2 == 0){//right\r\n"
//+ "        // else{}//left\r\n"
//+ "    let aa = (left + (i * 10));"
//+ "	   left=aa;"	
//+ "    console.log(aa);\r\n"
//+ "    a.style.transform = \"translateX(\"+aa+\"px)\";}"
//+ "else{"
//+ "console.log(\"kimrfkvir\");"
//+ "}}"
//+ "\r\n"

//
//+"	   var temp = 0;"
//+"	   var lefts = 0;"
//+ "    for(let i = 1;i<=dice;i++){\r\n"
//+ "	   temp = player1Score + i;\r\n"
//+ "        console.log(temp);\r\n"
//+ "	   lefts=left + (i * 30);"
//+ "     a.style.transform = \"translateX(\"+lefts+\"px)\";}"


//+ "    var aa = document.getElementById(\"box2\");\r\n"
//+ "    for(let k = 0;"+!SnakeAndLadder.isWin+";k++){\r\n"


}

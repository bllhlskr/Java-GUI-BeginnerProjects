package LAB;

import java.util.Scanner;

public class RockPaperScissorsGame {
	public static void main(String[] args) {
	
		int p1score =0;
		boolean flag = true;
		Player player2 = new Player("halis");
		player2.setScore(0);
	while(flag) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter scissors,paper or stone");
		String player1 = sc.next();
		player1.toLowerCase();
		
		
		if(player1.equals("scissors") && player2.getHandSign().equals("scissors") || 
				player1.equals("paper") && player2.getHandSign().equals("paper") ||
				player1.equals("stone") && player2.getHandSign().equals("stone")) {
			System.out.println("berabere " + " \nplayer one score is : "+ p1score + " player 2 score is : " + player2.getScore());
			
			
		}else if(player1.equals("scissors") && player2.getHandSign().equals("paper") || 
				player1.equals("paper") && player2.getHandSign().equals("stone") ||
				player1.equals("stone") && player2.getHandSign().equals("scissors")){
				player2.setScore(player2.getScore()+1);    
				System.out.println("player 2 won " + " \nplayer one score is : "+ p1score + " player 2 score is : " + player2.getScore());
				System.out.println("****************");
			}
		
		
		else  {
			p1score++;
			System.out.println("player 1 won " + " \nplayer one score is : "+ p1score + " player 2 score is : " + player2.getScore());
			System.out.println("**************");
		}
		
		
		
			if(p1score==3) {
			System.out.println("!!!!PLAYER 1 WON!!!!!");
			flag = false;}
			if(player2.getScore()==3){
				System.out.println("!!!!PLAYER 2 WON!!!!!!");
				flag = false;
			}
	
	
	}
		
	
		
		
		
		
		
	}
	

}

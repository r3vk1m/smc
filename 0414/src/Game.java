import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1:가위  2:바위  3:보]");
		
		int user = scan.nextInt();
		int com = (int)(Math.random()*3+1);
		
		Game(user,com);
	}
	
	public static void Game(int user, int com){
		switch(user){
		case 1: System.out.print("[나: 가위!] VS");break;
		case 2: System.out.print("[나: 바위!] VS");break;
		case 3: System.out.print("[나: 보!] VS");break;
		}
		switch(com){
		case 1: System.out.println("[컴퓨터: 가위!]");break;
		case 2: System.out.println("[컴퓨터: 바위!]");break;
		case 3: System.out.println("[컴퓨터: 보!]");break;
		}
		
		if(user == 1){
			if(com == 1){
				System.out.println("무승부...");
			}
			else if(com == 2){
				System.out.println("컴퓨터 승!!!");
			}
			else if(com == 3){
				System.out.println("사용자 승!!!");
			}
		}
		else if(user == 2){
			if(com == 1){
				System.out.println("사용자 승!!!");
			}
			else if(com == 2){
				System.out.println("무승부...");
			}
			else if(com == 3){
				System.out.println("컴퓨터 승!!!");
			}
		}
		else if(user == 3){
			if(com == 1){
				System.out.println("컴퓨터 승!!!");
			}
			else if(com == 2){
				System.out.println("무승부...");
			}
			else if(com == 3){
				System.out.println("사용자 승!!!");
			}
		}
			
		}
	}
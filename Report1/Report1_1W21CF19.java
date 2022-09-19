package Report1;

import java.util.Scanner;
import java.math.*;

public class Report1_1W21CF19 {
	
	public static int playGame(char player, char opponent) {
		if ( (player == '0' && opponent == '1') || (player == '1' && opponent == '2') || (player == '2' && opponent == '1') ) {
			return 1;
		} else if (player == opponent) {
			return 2;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opponent[] = {'0','1','2'};
		Scanner scan = new Scanner(System.in);
		while (true) {
			char input = scan.next().charAt(0);
			if (input == 'q') {
				System.out.println("Lets end the game!");
				System.exit(0);
			}
			char opponentMove = opponent[(int) (Math.random()*3)];
			int result = playGame(input,opponentMove);
			if (result == 1) {
				System.out.println("Player Wins!");
			}else if (result == 0) {
				System.out.println("Player Lose!");
			}else if (result == 2) {
				System.out.println("Draw!");
			}
		}
	}

}

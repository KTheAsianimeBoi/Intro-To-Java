package Week7;

import java.util.Scanner;

public class Ex7_4_1w21cf19 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		char operator = scan.next().charAt(0);
		switch(operator) {
		  case '+':
		    // code block
			System.out.println(first+second);
		    break;
		  case '-':
		    // code block
			System.out.println(first-second);
		    break;
		  case '*':
			    // code block
			  	System.out.println(first*second);
			    break;
		  case '/':
			  System.out.println(first/second);
			    // code block
			    break;
		}
	}
}

package Week5;

import java.util.Scanner;

public class Ex4_2_1w21cf19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if (input % 3 == 0 ) {
			if(input % 5 == 0) {
				System.out.println("Fizz Buzz");
			}else {
				System.out.println("Fizz ");
			}
		}else if(input % 5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(input);
		}

}
	
}
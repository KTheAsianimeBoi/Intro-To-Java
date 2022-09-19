package Week5;

import java.util.Scanner;

public class Ex4_3_1w21c19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("Leap Year!");
			}else {
				if (year % 400 == 0) {
					System.out.println("Leap Year!");
				}else {
					System.out.println("Not a leap year!");
				}
			}
		}else {
			System.out.println("Not a leap year!");
		}
}
	
}
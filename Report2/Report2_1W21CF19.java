package Report2;

import java.util.Scanner;

public class Report2_1W21CF19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row and column sizes for the 1st matrix ");
		int row1 = scan.nextInt();
		int column1 = scan.nextInt();
		System.out.println("Enter the row and column sizes for the 2nd matrix ");
		int row2 = scan.nextInt();
		int column2 = scan.nextInt();
		if (column1 != row2) {
			System.out.println("Multiplication Not Possible!");
			System.exit(0);
		}
		int first[][]= new int[row1][column1];
		int second[][]= new int[column1][row2];
		System.out.println("Enter the entries for 1st matrix:");
		for (int i = 0 ; i < row1 ; i++) {
			for (int j = 0; j < column1; j++) {
				first[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter the entries for 2nd matrix:");
		for (int i = 0 ; i < column1 ; i++) {
			for (int j = 0; j < column2; j++) {
				second[i][j] = scan.nextInt();
			}
		}
		
		int[][] result = new int[row1][column2];
		
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column2; j++) {
				for (int k = 0 ; k < column1; k++) {
					result[i][j]+= first[i][k]* second[k][j];
				}
			}
		}
		
		System.out.println("The result of the multiplication: ");
		for (int i = 0; i< row1; i++) {
			for (int j = 0; j< column2; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

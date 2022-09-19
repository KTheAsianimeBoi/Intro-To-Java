package Week11;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ex111 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			System.out.println(String.format("%.1f", a+b));
			System.out.println(String.format("%.1f", a-b));
			System.out.println(String.format("%.1f", a*b));
			System.out.println(String.format("%.1f", a/b));
			
		} catch(Exception e) {
			System.out.println(e);
			System.exit(1);
		}
	}

	
}
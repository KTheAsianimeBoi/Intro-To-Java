package Week11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = args[0];
		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("Java is a general-purpose computer-programming language.");
			pw.close();
		}catch(Exception e) {
			System.out.println(e);
			System.exit(1);
		}
	}

	
}

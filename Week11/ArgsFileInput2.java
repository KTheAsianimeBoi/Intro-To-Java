package Week11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArgsFileInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "khoa.txt";
		String line;
		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(fw);
			
			for(int i = 1; i <= 10; i++) {
				pw.println(i*100);
			}
			
			pw.close();
		}catch(Exception e) {
			System.out.println(e);
			System.exit(1);
		}
	}

	
}

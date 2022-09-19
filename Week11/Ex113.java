package Week11;

import java.io.File;
import java.util.Scanner;

public class Ex113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File(args[0]);
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	
}

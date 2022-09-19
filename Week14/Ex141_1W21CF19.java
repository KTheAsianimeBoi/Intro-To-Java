package Week14;

public class Ex141_1W21CF19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int track = 1;
		while (track <1000) {
			if (track % 3 == 0 || track % 5 == 0 ) {
				sum+= track;
			}
			track++;
		}
		System.out.println("The result is " + sum);
	}

}

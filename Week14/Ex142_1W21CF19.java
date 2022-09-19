package Week14;

public class Ex142_1W21CF19 {

	public static void main(String[] args) {
		int num = 20;
		for (int i = 2; i <= 20; i++) {
			if (num % i != 0) {
				i = 1;
				num++;
				continue;
			}
		}
		System.out.println("The result is " + num);
	}

}

package Week10;

public class Ex102_1W21CF19 {
	
	public static int Recursive_Decimal_Binary(int decimal) {
		if (decimal == 0) {
			return 0;
		} else {
			return (decimal % 2) + 10* Recursive_Decimal_Binary(decimal/2);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal = 7;
		int binary = Recursive_Decimal_Binary(decimal);
		System.out.println(binary);
	}
}

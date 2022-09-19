package Week9;

import java.util.*;
import java.lang.Math;
public class Ex95_1W21CF19 {
	public static void main(String[] args) {
		double s;
		s = four_arithmetic_operator(2,4,'/');
		System.out.println(String.format("%.2f", s));
	}

	public static double four_arithmetic_operator(double num1, double num2, char symbol) {
		double result = 0;
		
		if(symbol=='+')
			result= num1+num2;
		if(symbol=='-')
			result= num1-num2;
		if(symbol=='*')
			result= num1*num2;
		if(symbol=='/')
			result= num1/num2;
		
		return result;

		
		
	}
}

package Week9;

import java.util.*;

public class Ex93_1W21CF19 {
	public static void main(String[] args) {
		double Area;
		Area = triangle_area(4, 6);
		System.out.println(Area);
	}

	public static double triangle_area(double Base, double Height) {
		double result;
		result = (Base*Height)/2;
		return result;
	}
}

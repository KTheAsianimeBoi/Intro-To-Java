package Week9;

import java.util.*;
import java.lang.Math;
public class Ex94_1W21CF19 {
	public static void main(String[] args) {
		double s;
		s = circle_area(4);
		System.out.println(String.format("%.2f", s));
	}

	public static double circle_area(double radius) {
		double result;
		result = Math.PI * (radius * radius);
		return result;
	}
}

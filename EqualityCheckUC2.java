/*
 * To check equality of two lines based on the end points, So that It can be known when two lines are equal.
 */
package com.Bridgelabz.LineComparisonOOPS;
import java.util.Scanner;

public class EqualityCheckUC2 {
	private void ecCalculation() {
		Scanner line = new Scanner(System.in);
		// Taking Co-ordinates of two lines from user
		System.out.println("Enter the Value of x1 Co-ordinate for Line1: ");
		double x1 = line.nextInt();
		System.out.println("Enter the Value of y1 Co-ordinate  for Line1: ");
		double y1 = line.nextInt();
		System.out.println("Enter the Value of x2 Co-ordinate for Line1: ");
		double x2 = line.nextInt();
		System.out.println("Enter the Value of y2 Co-ordinate for Line1: ");
		double y2 = line.nextInt();
		System.out.println("Enter the Value of a1 Co-ordinate for Line2: ");
		double a1 = line.nextInt();
		System.out.println("Enter the Value of b1 Co-ordinate for Line2: ");
		double b1 = line.nextInt();
		System.out.println("Enter the Value of a2 Co-ordinate for Line2: ");
		double a2 = line.nextInt();
		System.out.println("Enter the Value of b2 Co-ordinate for Line2: ");
		double b2 = line.nextInt();        
		//calulating length of line1
		Double length_of_line1 = Math.sqrt((x2 - x1) *(x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("length of Line1 = " + length_of_line1);        
		//calulating length of line2
		Double length_of_line2 = Math.sqrt((a2 - a1) *(a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("length of Line2 = " + length_of_line2);        
		//Comparing the length of line1 and line2 using equals
		boolean compare = length_of_line1.equals(length_of_line2);
		if (compare)
			System.out.println("Both lines are equal");

		else
			System.out.println("Both lines are not equal");
	}
	
	public static void main(String[] args) {
		EqualityCheckUC2 lineComparison = new EqualityCheckUC2();
		lineComparison.ecCalculation();        
	}	
}
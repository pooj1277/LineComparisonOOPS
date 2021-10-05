/*
 * model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system and calculate its length.
 *  Assume the end points of line as (x1,y1) ,(x2,y2)
 *  
 */
package com.Bridgelabz.LineComparisonOOPS;
import java.util.Scanner;
public class DrawLineUC1 {
	private void lcCalculation() {
		//taking end points of line from user (x1,y1) ,(x2,y2)
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the Value of x1 Co-ordinate: \n");
		double x1=sc.nextInt();
		System.out.println("Enter the Value of y1 Co-ordinate: \n");
		double y1=sc.nextInt();
		System.out.println("Enter the Value of x2 Co-ordinate: \n");
		double x2=sc.nextInt();
		System.out.println("Enter the Value of y2 Co-ordinate: \n");
		double y2=sc.nextInt();
		double length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Length of the line having co-ordinates \t"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+length);

	}
	
	public static void main(String arg[]){
		DrawLineUC1 lineComparison = new DrawLineUC1();
		lineComparison.lcCalculation();		
	}	
}

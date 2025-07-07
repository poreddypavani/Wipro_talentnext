package java_fundamentals;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first non negative number");
		int num1=s.nextInt();
		System.out.print("Enter second non negative number");
		int num2=s.nextInt();
		boolean result=(num1%10)==(num2%10);
		System.out.println("last digit " + " ( " + num1 + " , " +num2 + " ) " + " is " + result);
		s.close();
	}
}
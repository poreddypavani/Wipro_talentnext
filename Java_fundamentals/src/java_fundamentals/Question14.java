package java_fundamentals;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first character: ");
		char c1 = sc.next().charAt(0);
		System.out.println("Enter second character: ");
		char c2 = sc.next().charAt(0);

		if (c1 < c2) {
			System.out.println(c1 + " , " + c2);
		} else {
			System.out.println(c2 + " , " + c1);
		}
		sc.close();

	}

}
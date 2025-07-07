package java_fundamentals;
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter gender (Male/Female): ");
		String gender = sc.nextLine();

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		if (gender.equalsIgnoreCase("Female")) {
			if (age >= 1 && age <= 58) {
				System.out.println("The percentage of interest is 8.2%");
			} else {
				if (age >= 59 && age <= 100) {
					System.out.println("The percentage of interest is 9.2%");
				} else {
					System.out.println("Invalid age range.");
				}
			}
		} else {
			if (gender.equalsIgnoreCase("Male")) {
				if (age >= 1 && age <= 58) {
					System.out.println("The percentage of interest is 8.4%");
				} else {
					if (age >= 59 && age <= 100) {
						System.out.println("The percentage of interest is 10.5%");
					} else {
						System.out.println("Invalid age range.");
					}
				}
			} else {
				System.out.println("Invalid gender. Please enter 'Male' or 'Female'.");
			}
		}
		
		sc.close();
		
	}
}
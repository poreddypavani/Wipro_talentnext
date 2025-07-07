package java_fundamentals;
import java.util.Scanner;
public class Question16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            char upper = Character.toUpperCase(ch);
            System.out.println("i/p: " + ch);
            System.out.println("o/p: " + ch + "->" + upper);
        } else if (ch >= 'A' && ch <= 'Z') {
            char lower = Character.toLowerCase(ch);
            System.out.println("i/p: " + ch);
            System.out.println("o/p: " + ch + "->" + lower);
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
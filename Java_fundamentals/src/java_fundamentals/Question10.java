package java_fundamentals;
import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number");
		int num=s.nextInt();
		int count=0;
		
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
        }
		if(count==1) {
			System.out.println(num + " is a prime number ");
		}
		else {
			System.out.println(num + "is not a prime number");
		}
		s.close();

	}

}
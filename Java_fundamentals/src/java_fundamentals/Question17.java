package java_fundamentals;

public class Question17 {

	public static void main(String[] args) {
		 System.out.println("Prime numbers between 10 and 99 are:");

	        for (int num = 10; num <= 99; num++) {
	            boolean isPrime = true;

	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime)
	                System.out.print(num + " ");
	        }
	    }
	}
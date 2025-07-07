package java_fundamentals;

public class Question1 {

	public static void main(String[] args) {
		if(args.length<1) {
			System.out.println("enter 1 argument");
		}
		String sample=args[0];
		System.out.println("Welcome " + sample);
	}
}
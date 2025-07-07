package java_fundamentals;

public class Question2 {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("enter 2 companies");
			return;
		}
		String company=args[0];
		String loc=args[1];
		System.out.println(company + " technologies " + loc);
	}
}
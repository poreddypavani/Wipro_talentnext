package arrays_java;

public class arrays11 {
	public static void main(String[] args) {
		int[] arr= {5,6,5,6};
		boolean only14=true;
		for (int num: arr) {
			if(num != 1 && num != 4) {
				only14=false;
				break;
			}
		}
		System.out.println(only14);
	}
}
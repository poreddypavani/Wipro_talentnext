package arrays_java;

public class arrays2 {

	public static void main(String[] args) {
		int[] num= {20,60,40,30,10};
		int max=num[0];
		int min=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("Max value in the array: " + max);
		System.out.println("Min value in the array: " + min);
	}
}
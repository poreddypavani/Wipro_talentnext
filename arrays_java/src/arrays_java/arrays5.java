package arrays_java;

import java.util.Arrays;

public class arrays5 {
	public static void main(String[] args) {
		int[] num= {15,17,19,21,23,25,27,29};
		Arrays.sort(num);
		int smallest1=num[0];
		int smallest2=num[1];
		int largest1=num[num.length-1];
		int largest2=num[num.length-2];
		System.out.println("Smallest two num: " + smallest1 + "," + smallest2);
		System.out.println("Largest two numbers: " + largest1 + "," + largest2);
	}
}
package arrays_java;

import java.util.Arrays;

public class arrays6 {
	public static void main(String[] args) {
		int[] num= {12,15,18,20,25};
		Arrays.sort(num);
		System.out.print("Sorted array: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
	}
}
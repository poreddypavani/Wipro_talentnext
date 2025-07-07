package arrays_java;

import java.util.Arrays;

public class arrays12 {
	public static void main(String[] args) {
		int[] a= {6,3,8};
		int[] b= {9,4,2};
		int[] result=middleWay(a,b);
		System.out.println("Middle elements: " + Arrays.toString(result));
	}
	public static int[] middleWay(int[] a, int[] b) {
		return new int[] { a[1], b[1] };
	}
}	
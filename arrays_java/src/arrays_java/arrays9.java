package arrays_java;

import java.util.Arrays;

public class arrays9 {
	public static void main(String[] args) {
		int[] arr1= {1,10,10,2};
		int[] arr2 = {10,2,10};
		int[] arr3= {1,99,10};
		withoutten(arr1);
		withoutten(arr2);
		withoutten(arr3);
	}
	public static void withoutten(int[] arr) {
		int[] result=new int[arr.length];
		int index=0;
		for(int num:arr) {
			if(num!= 10) {
				result[index]=num;
				index++;
			}
		}
		System.out.println("withoutten: " + Arrays.toString(result));
	}
}
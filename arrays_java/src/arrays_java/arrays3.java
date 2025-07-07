package arrays_java;

import java.util.Scanner;

public class arrays3 {
	public static void main(String[] args) {
		int[] array= {1,4,34,56,7};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to search: ");
		int searchElement=sc.nextInt();
		int index=-1;
		for (int i=0;i<array.length;i++) {
			if(array[i]== searchElement) {
				index=i;
				break;
			}
		}
		System.out.println(index);
		sc.close();
		}
	}
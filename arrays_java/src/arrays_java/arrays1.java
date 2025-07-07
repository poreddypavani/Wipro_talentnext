package arrays_java;

public class arrays1 {

	public static void main(String[] args) {
		int[] numbers= {30,60,90,120,150};
		int sum=0;
		double average;
		for (int num : numbers) {
			sum += num;
		}
		average= (double) sum / numbers.length;
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average of array elements: " + average);
	}
}
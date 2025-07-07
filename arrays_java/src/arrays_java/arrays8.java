package arrays_java;

public class arrays8 {
	public static void main(String[] args) {
		int[] arr = {10, 3, 6, 1, 2, 7, 9};  

        int sum = 0;
        boolean skip = false;

        for (int num : arr) {
            if (num == 6) {
                skip = true; 
            }

            if (!skip) {
                sum += num; 
            }

            if (num == 7 && skip) {
                skip = false; 
            }
        }
        System.out.println("Sum = " + sum);
    }
}
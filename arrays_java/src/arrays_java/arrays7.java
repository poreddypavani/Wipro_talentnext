package arrays_java;

import java.util.LinkedHashSet;

public class arrays7 {
	public static void main(String[] args) {
        int[] input = {12, 34, 12, 45, 67, 89};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : input) {
            set.add(num);
        }

        Integer[] uniqueArray = set.toArray(new Integer[0]);
        System.out.print("O/P: {");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i]);
            if (i < uniqueArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
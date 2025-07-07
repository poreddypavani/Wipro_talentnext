package arrays_java;

public class arrays4 {
	public static void main(String[] args) {
		int[] asciiValues= {82,84,85,86,88};
		System.out.print("Corresponding characters:");
		for(int i=0;i<asciiValues.length;i++) {
			char ch=(char)asciiValues[i];
			System.out.print(ch + " ");
		}
	}
}

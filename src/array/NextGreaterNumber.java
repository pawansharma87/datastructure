package array;

import java.util.Arrays;

public class NextGreaterNumber {
	public static void main(String[] args) {
		int digits[] = {5,3,4,9,7,6 }; // output will be 251678
		int n = digits.length;
		findNext(digits, n);
	}

	public static void swap(int[] digits, int i,int j) {
		int temp = digits[i];
		digits[i] = digits[j];
		digits[j] = temp;
		
	}
	private static void findNext(int[] digits, int n) {
		int i;

		for (i = n - 1; i > 0; i--) {
			if (digits[i - 1] < digits[i]) {
				break;
			}
		}
		if (i == 0){ 
			//System.out.println("If all digits sorted in descending order, then output is always “Not Possible”. For example, 4321.");
			System.out.println("Impossible");
		}else if (i + 1 == digits.length) {
			System.out.println("If all digits are sorted in ascending order, then we need to swap last two digits. For example, 1234.");
			swap(digits, i-1, digits.length-1);
		} else {
			System.out.println(digits[i - 1]);
			int j = i, k = i;
			int min = digits[j];
			for (; j < n; j++) {
				if (digits[j] < min) {
					// min=digits[j];
					k = j;
				}
			}
			System.out.println(digits[k]);
			// Swap the above found two digits, we get 536974 in above example.
			swap(digits, i-1, digits.length-1);

			// Now sort all digits from position next to ‘d’ to the end of
			// number.
			Arrays.sort(digits, i, n);
		}

		for (int l = 0; l < digits.length; l++) {
			System.out.print(digits[l] + " ");
		}

	}
}

## Find next greater number with same set of digits

**Problem :** 
	
Given a number n, find the smallest number that has same set of digits as n and is greater than n. If x is the greatest possible number with its set of digits, then print “not possible”.

```
Input:  n = "218765"
Output: "251678"

Input:  n = "1234"
Output: "1243"

Input: n = "4321"
Output: "Not Possible"

Input: n = "534976"
Output: "536479"

```
### Following are few observations about the next greater number.

	1. If all digits sorted in descending order, then output is always “Not Possible”. For example, 4321.
	2. If all digits are sorted in ascending order, then we need to swap last two digits. For example, 1234.
	3. Traverse the given number from rightmost digit, keep traversing till you find a digit which is smaller than the previously traversed digit. For example, if the input number is “534976”, we stop at 4 because 4 is smaller than next digit 9. If we do not find such a digit, then output is “Not Possible”.
	4. Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. For “534976″, the right side of 4 contains “976”. The smallest digit greater than 4 is 6.
	5. Swap the above found two digits, we get 536974 in above example.
	6. Now sort all digits from position next to ‘d’ to the end of number. The number that we get after sorting is the output. For above example, we sort digits in bold 536974. We get “536479” which is the next greater number for input 534976.

	

	


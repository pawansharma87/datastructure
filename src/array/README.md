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


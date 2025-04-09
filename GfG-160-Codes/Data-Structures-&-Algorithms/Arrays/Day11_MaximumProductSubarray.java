/* Maximum Product Subarray
Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

Note: It is guaranteed that the output fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.
Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is {-3, -10} with product = (-3) * (-10) = 30.
Input: arr[] = [2, 3, 4] 
Output: 24 
Explanation: For an array with all positive elements, the result is product of all elements. 
Constraints:
1 ≤ arr.size() ≤ 106
-10  ≤  arr[i]  ≤  10
*/

// Code-
class Solution {
    int maxProduct(int[] arr) {
        int n=arr.length;
        int currMin=arr[0];
        int currMax=arr[0];
        int maxProd=arr[0];
        for(int i=1;i<n;i++){
            int temp=Math.max(arr[i],Math.max(currMax*arr[i],currMin*arr[i]));
            currMin=Math.min(arr[i],Math.min(currMax*arr[i],currMin*arr[i]));
            currMax=temp;
            maxProd=Math.max(maxProd,currMax);
        }
        return maxProd;
    }
}

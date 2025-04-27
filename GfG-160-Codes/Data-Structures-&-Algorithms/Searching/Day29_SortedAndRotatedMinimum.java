/*Sorted and Rotated Minimum
A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it. 

Examples:

Input: arr[] = [5, 6, 1, 2, 3, 4]
Output: 1
Explanation: 1 is the minimum element in the array.
Input: arr[] = [3, 1, 2]
Output: 1
Explanation: Here 1 is the minimum element.
Input: arr[] = [4, 2, 3]
Output: 2
Explanation: Here 2 is the minimum element.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 109
*/

// Code-
class Solution {
    public int findMin(int[] arr) {
        int lo=0, hi=arr.length-1;
        while(lo<hi){
            if(arr[lo]<arr[hi]){
                return arr[lo];
            }
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[hi]){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return arr[lo];
    }
}

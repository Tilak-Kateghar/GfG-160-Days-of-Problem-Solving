/* Rotate Array
Difficulty: MediumAccuracy: 37.06%Submissions: 472K+Points: 4Average Time: 20m
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
Constraints:
1 <= arr.size(), d <= 105
0 <= arr[i] <= 105
*/

// Code-
class Solution {
    int[] rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    void reverse(int arr[], int left, int right){
        while(left<right){
            int tempVar=arr[left];
            arr[left]=arr[right];
            arr[right]=tempVar;
            left++;
            right--;
        }
    }
}

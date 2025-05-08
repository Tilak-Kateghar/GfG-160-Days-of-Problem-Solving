/* Search in a sorted Matrix
Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

Examples:

Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
Output: true
Explanation: 14 is present in the matrix, so output is true.
Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
Output: false
Explanation: 42 is not present in the matrix.
Input: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
Output: true
Explanation: 101 is present in the matrix.
Constraints:
1 <= n, m <= 1000
1 <= mat[i][j] <= 109
1 <= x <= 109
*/

// Code-
class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int n=mat.length, m=mat[0].length;
        int lo=0, hi=n*m-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col]==x){
                return true;
            }
            if(mat[row][col]<x){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return false;
    }
}

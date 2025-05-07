/* Search in a row-wise sorted matrix
Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.
Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].

Examples :

Input: mat[][] = [[3, 4, 9],[2, 5, 6],[9, 25, 27]], x = 9
Output: true
Explanation: 9 is present in the matrix, so the output is true.
Input: mat[][] = [[19, 22, 27, 38, 55, 67]], x = 56
Output: false
Explanation: 56 is not present in the matrix, so the output is false.
Input: mat[][] = [[1, 2, 9],[65, 69, 75]], x = 91
Output: false
Explanation: 91 is not present in the matrix.
Constraints:
1 <= n, m <= 1000
1 <= mat[i][j] <= 105
1 <= x <= 105
*/

// Code-
class Solution {
    public boolean searchRowMatrix(int[][] mat, int x) {
        for(int i=0;i<mat.length;i++){
            int lo=0, hi=mat[i].length-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(x==mat[i][mid]){
                    return true;
                }
                if(x>mat[i][mid]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        return false;
    }
}

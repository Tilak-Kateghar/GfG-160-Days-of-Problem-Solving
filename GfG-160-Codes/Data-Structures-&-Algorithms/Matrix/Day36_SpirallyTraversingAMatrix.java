/*Spirally traversing a matrix
You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

Examples:

Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
Explanation: 

Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
Explanation: Applying same technique as shown above.
Input: mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]
Output: [32, 44, 27, 23, 62, 50, 28, 54]
Explanation: Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].
Constraints:
1 <= n, m <= 1000
0 <= mat[i][j]<= 100
*/

// Code-
class Solution {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        int m=mat.length, n=mat[0].length;
        ArrayList<Integer> res=new ArrayList<>();
        int top=0, bottom=m-1, left=0, right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;++i){
                res.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;++i){
                res.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;--i){
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;--i){
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}

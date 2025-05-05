/*Rotate by 90 degree
Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 

Examples:

Input: mat[][] = [[1, 2, 3],
                [4, 5, 6]
                [7, 8, 9]]
Output: Rotated Matrix:
[3, 6, 9]
[2, 5, 8]
[1, 4, 7]
Input: mat[][] = [[1, 2],
                [3, 4]]
Output: Rotated Matrix:
[2, 4]
[1, 3]
Constraints:
1 ≤ n ≤ 102
0 <= mat[i][j] <= 103
*/

// Code-
class Solution {
    static void rotateby90(int mat[][]) {
        int n=mat.length;
        for(int i=0;i<n;i++){
            int start=0, end=n-1;
            while(start<end){
                int temp=mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
}

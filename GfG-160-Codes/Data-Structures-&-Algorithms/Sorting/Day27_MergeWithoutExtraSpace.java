/* Merge Without Extra Space
Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
2 2 3 4
7 10
Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output:
1 2 3 5 8 9
10 13 15 20
Explanation: After merging two sorted arrays we get 1 2 3 5 8 9 10 13 15 20.
Input: a[] = [0, 1], b[] = [2, 3]
Output:
0 1
2 3
Explanation: After merging two sorted arrays we get 0 1 2 3.
Constraints:
1 <= a.size(), b.size() <= 105
0 <= a[i], b[i] <= 107
*/

// Code-
class Solution {
    public void mergeArrays(int a[], int b[]) {
        int n=a.length, m=b.length;
        int gap=(n+m+1)/2;
        while(gap>0){
            int i=0, j=gap;
            while(j<n+m){
                if(j<n && a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }else if(i<n && j>=n && a[i]>b[j-n]){
                    int temp=a[i];
                    a[i]=b[j-n];
                    b[j-n]=temp;
                }else if(i>=n && b[i-n]>b[j-n]){
                    int temp=b[i-n];
                    b[i-n]=b[j-n];
                    b[j-n]=temp;
                }
                i++;
                j++;
            }
            if (gap==1) break;
            gap=(gap+1)/2;
        }
    }
}

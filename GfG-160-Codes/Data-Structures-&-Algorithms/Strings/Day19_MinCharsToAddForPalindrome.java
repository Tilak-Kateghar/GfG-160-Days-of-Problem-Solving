/* Min Chars to Add for Palindrome
Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.

Note: A palindrome string is a sequence of characters that reads the same forward and backward.

Examples:

Input: s = "abc"
Output: 2
Explanation: Add 'b' and 'c' at front of above string to make it palindrome : "cbabc"
Input: s = "aacecaaaa"
Output: 2
Explanation: Add 2 a's at front of above string to make it palindrome : "aaaacecaaaa"
Constraints:
1 <= s.size() <= 106
*/

// Code-
class Solution {
    public static int minChar(String s) {
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        s=s+'$'+rev;
        int[] lps=lps_arr(s);
        return n-lps[lps.length-1];
    }
    static int[] lps_arr(String s){
        int n=s.length();
        int[] lps=new int[n];
        int i=1, len=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}

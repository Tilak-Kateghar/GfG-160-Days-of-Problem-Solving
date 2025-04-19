/* Strings Rotations of Each Other
You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.

Note: The characters in the strings are in lowercase.

Examples :

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.
Input: s1 = "aab", s2 = "aba"
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.
Input: s1 = "abcd", s2 = "acbd"
Output: false
Explanation: Strings are not rotations of each other.
Constraints:
1 <= s1.size(), s2.size() <= 105
*/

// Code-\
class Solution {
    public static boolean areRotations(String s1, String s2) {
        String txt=s1+s1;
        return kmpSearch(txt,s2);
    }
    static boolean kmpSearch(String txt, String pat){
        int n=txt.length();
        int[] lps=lpsArr(pat);
        int i=0, j=0;
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
                if(j==pat.length()){
                    return true;
                }
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return false;
    }
    static int[] lpsArr(String s){
        int n=s.length();
        int[] lps=new int[n];
        lps[0]=0;
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

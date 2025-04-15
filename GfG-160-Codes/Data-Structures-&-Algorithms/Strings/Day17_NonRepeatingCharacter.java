/* Non Repeating Character
Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s.
If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
Input: s = "aabbccc"
Output: -1
Explanation: All the characters in the given string are repeating.
Constraints:
1 ≤ s.size() ≤ 105
*/

// Code-
class Solution {
    static char nonRepeatingChar(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        char c='$';
        for(int i=0;i<n;i++){
            char com=arr[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j && com==arr[j]){
                    count=1;
                    break;
                }
            }
            if(count==0){
                c=com;
                break;
            }
        }
        return c;
    }
}

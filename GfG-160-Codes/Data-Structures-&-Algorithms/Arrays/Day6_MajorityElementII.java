/* Majority Element II
You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.

Examples:

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.
Input: arr[] = [1, 2, 3, 4, 5]
Output: []
Explanation: o candidate occur more than n/3 times.
Constraint:
1 <= arr.size() <= 106
-109 <= arr[i] <= 109
*/

// Code-
class Solution {
    public List<Integer> findMajority(int[] nums) {
        int n=nums.length;
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=1;
            boolean counted=false;
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    counted=true;
                    break;
                }
            }
            if(counted){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>n/3){
                result.add(nums[i]);
            }
        }
        Collections.sort(result);
        return result;
    }
}

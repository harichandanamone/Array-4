//TC - O(N)
//SC -O(1)
// Passed all Test cases on Leetcode : Yes
// Any issues faced while executing the code : No
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0],max = nums[0];
        for(int i=1;i<nums.length;i++){
            rSum =Math.max(rSum+nums[i],nums[i]);
            max = Math.max(max,rSum);
        }
        return max;
    }
}

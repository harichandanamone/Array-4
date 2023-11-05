//TC O(nlogn) - as we are sorting the array
//SC-O(1)
// Passed all Test cases on Leetcode : Yes
// Any issues faced while executing the code : No

import java.util.Arrays;

public class ArrayPartition {

    public int arrayPairSum(int[] nums) {

        int n = nums.length,ans=0;
        Arrays.sort(nums);
        for(int i =0;i<n;i+=2){
            ans += nums[i];
        }
        return ans;
    }
}

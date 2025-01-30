import java.util.*;

class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<=i+nums[i]; j++) {
                if(j < n && dp[j] == 0) dp[j] = dp[i]+1;
            }
        }

        return dp[n-1];
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = -10_000;

        double sum = 0;
        for(int i=0; i<k; i++) sum += nums[i];
        maxAvg = Math.max(maxAvg, sum/k);

        for(int i=1; i<nums.length-k; i++) {
            sum = sum - nums[i-1] + nums[i+k-1];
            maxAvg = Math.max(maxAvg, sum/k);
        }

        return maxAvg;
    }
}
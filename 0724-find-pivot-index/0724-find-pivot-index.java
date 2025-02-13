class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;

        for(int i=1; i<nums.length; i++) rightSum += nums[i];
        if(leftSum == rightSum) return 0;

        for(int pivot=1; pivot<nums.length; pivot++) {
            leftSum += nums[pivot-1];
            rightSum -= nums[pivot];
            if(leftSum == rightSum) return pivot;
        }

        return -1;
    }
}
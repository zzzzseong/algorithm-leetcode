class Solution {
    public void moveZeroes(int[] nums) {
        for(int left=0, right=0; right<nums.length; right++) {
            if(nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
} 
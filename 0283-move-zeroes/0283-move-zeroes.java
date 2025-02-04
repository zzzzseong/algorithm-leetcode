class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 1) return;

        for(int left=0, right=0; left<n; left++) {
            while(right < n && nums[right] == 0) right++;

            if(right == n) break;

            if(nums[left] == 0) swap(nums, left, right);

            right++;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
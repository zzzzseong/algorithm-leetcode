class Solution {
    public int removeDuplicates(int[] nums) {
        
        int tail = 1;
        for(int i=2; i<nums.length; i++) {
            if(nums[i] == nums[tail] && nums[i] == nums[tail-1]) continue;
            nums[++tail] = nums[i];
        }

        return tail+1;
    }
}
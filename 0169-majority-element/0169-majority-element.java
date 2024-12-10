class Solution {
    public int majorityElement(int[] nums) {

        //majority는 2/n개 이상 존재함.
        
        int count = 0, majority = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == majority) count++;
            else count--;

            if(count == -1) {
                majority = nums[i];
                count = 1;
            }
        }
        
        
        return majority;
    }
}
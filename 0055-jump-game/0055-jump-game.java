class Solution {
    public boolean canJump(int[] nums) {
        
        int dist = 0;
        for(int i=nums.length-2; i>=0; i--) {
            dist++;

            /* if - nums[i] >= dist > 도달 가능. dist를 0으로 변경 > continue */
            if(nums[i] >= dist) dist = 0;

            /* if - nums[i] < dist > 도달 불가능. */
        }

        return dist == 0 ? true : false;
    }
}
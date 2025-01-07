class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;

        k = k % len;

        int[] answer = new int[len];

        for(int i=0; i<len; i++) answer[(i+k)%len] = nums[i];
        for(int i=0; i<answer.length; i++) nums[i] = answer[i];
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;

        /* rotate right */
        int left = 0, mid = k-1, right = len-1;

        /* rotate left */
        // int left = 0, mid = len-k-1, right = len-1;

        rotate(nums, left, mid, right);
    }

    public void rotate(int[] nums, int left, int mid, int right) {
        reverse(nums, left, right);
        reverse(nums, left, mid);
        reverse(nums, mid+1, right);
    }

    private void reverse(int[] nums, int left, int right) {
        while(right > left) {
            int tmp = nums[right];
            nums[right--] = nums[left];
            nums[left++] = tmp;
        }
    }
}
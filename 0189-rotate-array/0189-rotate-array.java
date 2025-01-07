class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;

        /* rotate right */
        rotate(nums, 0, k-1, len-1);

        /* rotate left */
        // rotate(nums, 0, len-k-1, len-1);
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
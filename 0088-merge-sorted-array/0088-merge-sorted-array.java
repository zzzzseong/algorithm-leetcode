import java.util.*;

/**
 * Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] answer = new int[m+n];

        int mIdx = 0;
        int nIdx = 0;
        int aIdx = 0;

        while(mIdx < m && nIdx < n) {
            if(nums1[mIdx] >= nums2[nIdx]) answer[aIdx++] = nums2[nIdx++];
            else answer[aIdx++] = nums1[mIdx++];
        }

        while(mIdx < m) {
            answer[aIdx++] = nums1[mIdx++];
        }
        while(nIdx < n) {
            answer[aIdx++] = nums2[nIdx++];
        }

        System.arraycopy(answer, 0, nums1, 0, m+n);
    }
}
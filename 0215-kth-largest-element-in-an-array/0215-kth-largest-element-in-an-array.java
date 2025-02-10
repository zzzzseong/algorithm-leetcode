import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int num : nums) pq.offer(num);

        while(k-- > 1) pq.poll();

        return pq.poll();
    }
}
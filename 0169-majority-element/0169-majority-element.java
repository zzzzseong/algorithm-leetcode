import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int maxKey = 0, max = 0;
        for(int key : map.keySet()) {
            int num = map.get(key);
            if(num > max) {
                max = num;
                maxKey = key;
            }
        }
        
        return maxKey;
    }
}
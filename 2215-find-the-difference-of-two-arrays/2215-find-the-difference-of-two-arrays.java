import java.util.*;

class Solution {

    private Map<Integer, Integer> map = new HashMap<>();

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        for(int num : nums1) map.put(num, 0);
        for(int num : nums2) {
            if(map.get(num) == null) map.put(num, 1);
            if(map.get(num) == 0) map.put(num, -1);
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        for(int num : map.keySet()) {
            int idx = map.get(num);
            if(idx != -1) answer.get(idx).add(num);
        }
        
        return answer;
    }
}
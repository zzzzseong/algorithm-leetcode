class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int[] counts = new int[26];

        for(int i=0; i<n; i++) counts[s.charAt(i)-'a']++;

        int answer = 0;
        for(int count : counts) {
            if(count == 0) continue;
            
            if(count %2 == 0) answer += 2;
            else answer += 1;
        }

        return answer;
    }
}
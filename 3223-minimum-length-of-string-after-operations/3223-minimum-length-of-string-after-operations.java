class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int[] counts = new int[26];

        for(int i=0; i<n; i++) {
            int idx = s.charAt(i) - 'a';
            if(++counts[idx] == 3) counts[idx] -= 2;
        }

        int answer = 0;
        for(int count : counts) answer += count;

        return answer;
    }
}
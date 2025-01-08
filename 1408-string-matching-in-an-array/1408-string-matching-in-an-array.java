import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        boolean[] vis = new boolean[n];

        List<String> answer = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==j || vis[j]) continue;
                if(words[i].indexOf(words[j]) != -1) {
                    answer.add(words[j]);
                    vis[j] = true;
                }
            }
        }

        return answer;
    }
}
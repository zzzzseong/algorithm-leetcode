import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<String> stringMatching(String[] words) {        
        int n = words.length;
        List<String> answer = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i!=j && words[j].indexOf(words[i]) != -1) {
                    answer.add(words[i]);
                    break;
                }
            }
        }

        return answer;
    }
}
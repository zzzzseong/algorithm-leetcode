import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        
        List<String> answer = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(words[j].indexOf(words[i]) != -1) {
                    answer.add(words[i]);
                    break;
                }
            }
        }

        return answer;
    }
}
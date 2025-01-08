class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int answer = 0;
        for(int i=0; i<words.length; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(i==j) continue;
                if(isPrefixAndSuffix(words[i], words[j])) answer++;
            }
        }
        return answer;
    }

    public boolean isPrefixAndSuffix(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        if(l1 > l2) return false;

        return str1.equals(str2.substring(0, l1)) && str1.equals(str2.substring(l2-l1, l2));
    }
}
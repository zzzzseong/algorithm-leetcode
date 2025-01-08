class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int answer = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) answer++;
            }
        }
        return answer;
    }

    public boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.indexOf(str1) == 0 && (str2.lastIndexOf(str1) == str2.length()-str1.length());
    }
}
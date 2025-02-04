class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());

        StringBuilder merged = new StringBuilder();
        for(int i=0; i<minLength; i++) merged.append(word1.charAt(i)).append(word2.charAt(i));
        
        if(word1.length() > word2.length()) merged.append(word1.substring(minLength));
        if(word2.length() > word1.length()) merged.append(word2.substring(minLength));

        return merged.toString();
    }
}
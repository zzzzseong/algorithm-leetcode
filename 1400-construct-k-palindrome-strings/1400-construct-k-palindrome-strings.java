import java.util.*;

class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();

        if(n < k) return false;
        if(n == k) return true;

        int[] alphabets = new int[26];
        for(int i=0; i<n; i++) alphabets[s.charAt(i)-'a']++;

        for(int i=0; i<26; i++) if(alphabets[i]%2 != 0) k--;

        if(k < 0) return false;
        else return true;
    }
}
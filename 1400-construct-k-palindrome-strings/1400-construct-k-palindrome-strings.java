import java.util.*;

class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;

        int[] alphabets = new int[26];
        for(int i=0; i<s.length(); i++) alphabets[s.charAt(i)-'a']++;

        for(int i=0; i<alphabets.length; i++) if(alphabets[i]%2 != 0) k--;

        if(k < 0) return false;
        else return true;
    }
}
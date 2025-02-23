class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen == 0) return true;
        if(sLen > tLen) return false;

        int sIdx = 0;
        for(int i=0; i<tLen; i++) {
            if(t.charAt(i) == s.charAt(sIdx)) {
                if(++sIdx == sLen) break;
            }
        }
        return sIdx == sLen ? true : false;
    }
}
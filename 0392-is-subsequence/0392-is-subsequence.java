class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen == 0) return true;
        if(sLen > tLen) return false;

        int sIdx = 0;
        int tIdx = 0;
        while(sIdx < sLen) {
            int findIdx = t.indexOf(s.charAt(sIdx++), tIdx);
            if(findIdx == -1) return false;
            else tIdx = findIdx+1;
        }

        return true;
    }
}
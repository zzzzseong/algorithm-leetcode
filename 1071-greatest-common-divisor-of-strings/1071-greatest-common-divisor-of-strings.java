class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int gcd = this.gcd(str1.length(), str2.length());

        String gcdStr = str1.substring(0, gcd);

        if("".equals(str1.replace(gcdStr, "")) && "".equals(str2.replace(gcdStr, ""))) return gcdStr;

        return "";
    }

    private int gcd(int a, int b) {
        for(int i=Math.min(a, b); i>=2; i--) {
            if(a%i == 0 && b%i ==0) return i;
        }
        return 1;
    }
}
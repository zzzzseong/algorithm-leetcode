class Solution {
    public int largestAltitude(int[] gains) {
        int hightest = 0;

        int altitude = 0;
        for(int gain : gains) {
            altitude += gain;
            hightest = Math.max(hightest, altitude);
        }

        return hightest;
    }
}
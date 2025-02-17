class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        /* 종료 시간 기준 오름차순 정렬 */
        Arrays.sort(intervals, (i1, i2) -> {
            return i1[1]-i2[1];
        });

        int overlapping = 0;
        int endTime = -5 * 10_000;
        for(int[] interval : intervals) {
            if(interval[0] < endTime) overlapping++;
            else endTime = interval[1];
        }
        
        return overlapping;
    }
}
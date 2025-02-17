class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (p1, p2) -> {
            return p1[1] >= p2[1] ? 1 : -1;
        });
        
        int arrow = 1;
        int endPoint = points[0][1];
        for(int i=1; i<points.length; i++) {
            if(points[i][0] > endPoint) {
                arrow++;
                endPoint = points[i][1];
            }
        }

        return arrow;
    }
}
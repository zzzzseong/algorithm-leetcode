import java.util.*;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length;
        int m = maze[0].length;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0]+dirs[0][0], entrance[1]+dirs[0][1], 1});
        queue.offer(new int[]{entrance[0]+dirs[1][0], entrance[1]+dirs[1][1], 1});
        queue.offer(new int[]{entrance[0]+dirs[2][0], entrance[1]+dirs[2][1], 1});
        queue.offer(new int[]{entrance[0]+dirs[3][0], entrance[1]+dirs[3][1], 1});
        maze[entrance[0]][entrance[1]] = '+';

        while(!queue.isEmpty()) {
            int[] pos = queue.poll();

            if(pos[0] < 0 || pos[1] < 0 || pos[0] >= n || pos[1] >= m) continue;
            if(maze[pos[0]][pos[1]] == '+') continue;

            /* 탈출구에 도착했다면 RETURN */
            if(pos[0] == 0 || pos[1] == 0 || pos[0] == (n-1) || pos[1] == (m-1)) return pos[2];

            queue.offer(new int[]{pos[0]+dirs[0][0], pos[1]+dirs[0][1], pos[2]+1});
            queue.offer(new int[]{pos[0]+dirs[1][0], pos[1]+dirs[1][1], pos[2]+1});
            queue.offer(new int[]{pos[0]+dirs[2][0], pos[1]+dirs[2][1], pos[2]+1});
            queue.offer(new int[]{pos[0]+dirs[3][0], pos[1]+dirs[3][1], pos[2]+1});

            maze[pos[0]][pos[1]] = '+';
        }

        return -1;
    }
}
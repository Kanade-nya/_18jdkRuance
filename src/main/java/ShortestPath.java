import java.util.Queue;
import java.util.LinkedList;
public class ShortestPath {
    public int shortestPath(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        if (row == 1 ){
            if (col == 1) {
                return 0;
            }
        }

        int[][] dirs;
        dirs = new int[][]{
                {0, 1}, {0, -1}, {1, 0}, {-1, 0}
        };

        Queue<int[]> queue = new LinkedList<int[]>();
        int[][] visited = new int[row][col];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                visited[i][j] = -1;
            }
        }

        queue.offer(new int[]{0, 0, k});
        visited[0][0] = k;
        int step = 0;

        while (!queue.isEmpty()) {
            int currSize = queue.size();
            step++;

            for (int i = 0; i < currSize; ++i) {
                int[] currPos = queue.poll();
                for (int j = 0; j < 4; ++j) {
                    int nx = currPos[0] + dirs[j][0];
                    int ny = currPos[1] + dirs[j][1];
                    int currK = currPos[2];

                    if (nx >= 0 && nx < row && ny >= 0 && ny < col) {
                        if (nx == row - 1) {
                            if (ny == col - 1) {
                                return step;
                            }
                        }

                        if (grid[nx][ny] != 0) {
                            --currK;
                        }

                        if (currK >= 0) {
                            if (visited[nx][ny] == -1) {
                                queue.offer(new int[]{nx, ny, currK});
                                visited[nx][ny] = currK;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}

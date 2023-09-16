class Solution {
    int[] directions = new int[]{0, 1, 0, -1, 0};
    public int minimumEffortPath(int[][] heights) {
        int n = heights[0].length, m = heights.length;
        int[][] distance = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[]{0,0,0});
        distance[0][0] = 0;
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int dist = top[0];
            int row = top[1];
            int col = top[2];
            if(dist > distance[row][col]) continue;
            if(row == m - 1 && col == n - 1) return dist;
            for(int i = 0; i < 4; i++){
                int newRow = row + directions[i];
                int newCol = col + directions[i + 1];
                if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n){
                    int newDist = Math.max(dist, Math.abs(heights[newRow][newCol] - heights[row][col]));
                    if(distance[newRow][newCol] > newDist){
                        distance[newRow][newCol] = newDist;
                        pq.offer(new int[]{distance[newRow][newCol], newRow, newCol});
                    }
                }
            }
        }
        return 0;
    }
}
class Solution {
    public int maxDistance(int[][] grid) {
        int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int[][] seen = new int[grid.length][grid[0].length];
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                seen[i][j] = grid[i][j];
                if(grid[i][j] == 1) q.offer(new Pair(i,j));
            }
        }
        int distance = -1;
        while(!q.isEmpty()){
            int size = q.size();
            while(size > 0){
                size--;
                Pair<Integer, Integer> land = q.poll();
                for(int[] d : dir){
                    int x = land.getKey() + d[0];
                    int y = land.getValue() + d[1];
                    if(x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && seen[x][y] == 0){
                        seen[x][y] = 1;
                        q.offer(new Pair(x,y));
                    }
                }
            }
            distance++;
        }
        if(distance == 0) return -1;
        return distance;
    }
}
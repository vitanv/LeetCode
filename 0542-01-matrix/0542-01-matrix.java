class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int dir[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int m = mat.length, n = mat[0].length;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i, j});
                }else{
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while(!q.isEmpty()){
            int[] temp = q.poll();
            for(int[] d: dir){
                int c = temp[1] + d[1];
                int r = temp[0] + d[0];
                if(c < 0 || r < 0 || c >= n || r >= m || mat[r][c] <= mat[temp[0]][temp[1]] + 1) continue;
                q.add(new int[]{r,c});
                mat[r][c] = mat[temp[0]][temp[1]] + 1;
            }
        }
        return mat;
    }
}
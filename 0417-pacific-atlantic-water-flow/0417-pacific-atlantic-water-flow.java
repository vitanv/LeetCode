class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if(heights == null || m == 0 || n == 0) return answer;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for(int i = 0;i<m;i++){
            sink(heights, pacific, i, 0, Integer.MIN_VALUE);
            sink(heights, atlantic, i, n-1, Integer.MIN_VALUE);
        }
        for(int i = 0;i<n;i++){
            sink(heights, pacific, 0, i, Integer.MIN_VALUE);
            sink(heights, atlantic, m-1, i, Integer.MIN_VALUE);
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]) answer.add(Arrays.asList(i,j));
            }
        }
        return answer;
    }
    public void sink(int[][] matrix, boolean[][] visited,int i,int j, int h){
        System.out.println(i);
        if(i < 0|| j < 0|| i >= matrix.length || j >= matrix[0].length|| visited[i][j] || matrix[i][j] < h) return;
        visited[i][j] = true;
        sink(matrix, visited, i-1,j,matrix[i][j]);
        sink(matrix, visited, i+1,j,matrix[i][j]);
        sink(matrix, visited, i,j-1,matrix[i][j]);
        sink(matrix, visited, i,j+1,matrix[i][j]);
    }
}
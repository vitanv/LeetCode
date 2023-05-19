class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] colours = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(colours[i] == 0 && !dfs(graph, colours, i, 1)) return false;
        }
        return true;
    }
    public boolean dfs(int[][] graph, int[] colours, int i, int colour){
        colours[i] = colour;
        for(int j = 0; j < graph[i].length;j++){
            int k  = graph[i][j];
            if(colours[k] == -colour) continue;
            if(colours[k] == colour || !dfs(graph, colours, k, -colour)) return false;
        }
        return true;
    }
}
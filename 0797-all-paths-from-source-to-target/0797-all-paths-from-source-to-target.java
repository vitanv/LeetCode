class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        
        dfs(graph, 0, answer, path);
        
        return answer;
    }
    
    public void dfs(int[][] graph, int node, List<List<Integer>> answer, List<Integer> path){
        if(node == graph.length - 1){
            answer.add(new ArrayList<Integer>(path));
            return;
        }
        
        for(int next: graph[node]){
            path.add(next);
            dfs(graph, next, answer, path);
            path.remove(path.size() - 1);
        }
    }
}
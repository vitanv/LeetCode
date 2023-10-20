class Solution {
    private int answer = -1;
    public int longestCycle(int[] edges) {
        boolean[] visited = new boolean[edges.length];
        for(int i = 0; i < edges.length; i++){
            if(!visited[i]){
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, 1);
                dfs(i, edges, map, visited);
            }
        }
        return answer;
    }
    public void dfs(int node, int[] edges, HashMap<Integer, Integer> map, boolean[] visited){
        visited[node] = true;
        int neighbour = edges[node];
        if(neighbour != -1 && !visited[neighbour]){
            map.put(neighbour, map.get(node) + 1);
            dfs(neighbour, edges, map, visited);
        }else if(neighbour != -1 && map.containsKey(neighbour))
            answer = Math.max(answer, map.get(node) - map.get(neighbour) + 1);
    }
}
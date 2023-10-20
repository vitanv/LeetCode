class Solution {
    private int answer = Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
        for(int[] road : roads){
            map.computeIfAbsent(road[0], a -> new ArrayList<List<Integer>>()).add(Arrays.asList(road[1], road[2]));
            map.computeIfAbsent(road[1], a -> new ArrayList<List<Integer>>()).add(Arrays.asList(road[0], road[2]));
        }
        boolean[] visited = new boolean[n + 1];
        dfs(1, map, visited);
        return answer;
    }
    public void dfs(int node, HashMap<Integer, List<List<Integer>>> map, boolean[] visited){
        visited[node] = true;
        if(!map.containsKey(node)) return;
        for(List<Integer> edge : map.get(node)){
            answer = Math.min(answer, edge.get(1));
            if(!visited[edge.get(0)]) dfs(edge.get(0), map, visited);
        }
            
        
    }
}
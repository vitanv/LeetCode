class Solution {
    public long countPairs(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int[] edge : edges){
            map.computeIfAbsent(edge[0], a-> new ArrayList<Integer>()).add(edge[1]);
            map.computeIfAbsent(edge[1], a-> new ArrayList<Integer>()).add(edge[0]);
        }
        long pairs = 0;
        long size = 0;
        long remaining = n;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                size = dfs(i, map, visited);
                pairs += size * (remaining - size);
                remaining -= size;
            }
        }
        return pairs;
    }
    public int dfs(int node, HashMap<Integer, List<Integer>> map, boolean[] visited){
        int count = 1;
        visited[node] = true;
        if(!map.containsKey(node)) return count;
        for(int m : map.get(node)){
            if(!visited[m]) count+= dfs(m, map, visited);
        }
        return count;
    }
}
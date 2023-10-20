class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n - 1) return -1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int[] connection : connections){
            map.computeIfAbsent(connection[0], a -> new ArrayList<Integer>()).add(connection[1]);
            map.computeIfAbsent(connection[1], a -> new ArrayList<Integer>()).add(connection[0]);
        }
        int connected = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                connected++;
                dfs(i, map, visited);
            }
        }
        return connected - 1;
    }
    public void dfs(int node, HashMap<Integer, List<Integer>> map, boolean[] visited){
        visited[node] = true;
        if(!map.containsKey(node)) return;
        for(int m: map.get(node)){
            if(!visited[m]){
                visited[m] = true;
                dfs(m, map, visited);
            }
        }
    }
}
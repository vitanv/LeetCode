class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] dist1 = new int[edges.length];
        int[] dist2 = new int[edges.length];
        
        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);
        
        bfs(node1, edges, dist1);
        bfs(node2, edges, dist2);
        
        int minFinal = -1, minCurr = Integer.MAX_VALUE;
        for(int i = 0; i < edges.length; i++){
            if(minCurr > Math.max(dist1[i], dist2[i])){
                minFinal = i;
                minCurr = Math.max(dist1[i], dist2[i]);
            }
        }
        return minFinal;
    }
    
    public void bfs(int node, int[] edges, int[] dist){
        Queue<Integer> q = new LinkedList<>();
        Boolean[] visited = new Boolean[edges.length];
        Arrays.fill(visited, false);
        dist[node] = 0;
        q.offer(node);
        
        while(!q.isEmpty()){
            int temp = q.poll();
            if(visited[temp]) continue;
            visited[temp] = true;
            
            int neighbour = edges[temp];
            if(neighbour != -1 && !visited[neighbour]){
                dist[neighbour] = 1 + dist[temp];
                q.offer(neighbour);
            }
        }
        
    }
}
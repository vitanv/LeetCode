class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        boolean[] seen = new boolean[n];
        seen[source] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        for(int[] edge : edges){
            map.computeIfAbsent(edge[0], val -> new ArrayList<Integer>()).add(edge[1]);
            map.computeIfAbsent(edge[1], val -> new ArrayList<Integer>()).add(edge[0]);
        }
        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr == destination) return true;
            for(int next : map.get(curr)){
                if(!seen[next]){
                    seen[next] = true;
                    q.offer(next);
                }
            }
        }
        return false;
    }
}
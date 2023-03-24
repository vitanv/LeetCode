class Solution {
    public int count = 0;
    public void dfs(int node, int parent, HashMap<Integer, List<List<Integer>>> map){
        if(!map.containsKey(node)) return;
        for(List<Integer> m : map.get(node)){
            int child = m.get(0);
            int sign = m.get(1);
            if(child != parent){
                count += sign;
                dfs(child, node, map);
            }
        }
    }
    public int minReorder(int n, int[][] connections) {
        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
        for(int[] connection : connections){
            map.computeIfAbsent(connection[0], a -> new ArrayList<List<Integer>>()).add(Arrays.asList(connection[1], 1));
            map.computeIfAbsent(connection[1], a -> new ArrayList<List<Integer>>()).add(Arrays.asList(connection[0], 0));
        }
        dfs(0, -1, map);
        return count;
    }
}
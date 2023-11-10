class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    public int[] restoreArray(int[][] adjacentPairs) {
        int root = 0;
        for(int[] edge : adjacentPairs){
            int x = edge[0];
            int y = edge[1];
            if(!map.containsKey(x)){
                map.put(x, new ArrayList());
            }
            if(!map.containsKey(y)){
                map.put(y, new ArrayList());
            }
            map.get(x).add(y);
            map.get(y).add(x);
        }
        for(int key : map.keySet()){
            if(map.get(key).size() == 1){
                root = key;
                break;
            }
        }
        int[] answer = new int[map.size()];
        dfs(root, Integer.MAX_VALUE, answer, 0);
        return answer;
    }
    public void dfs(int node, int prev, int[] answer, int i){
        answer[i] = node;
        for(int neighbour: map.get(node)){
            if(neighbour != prev){
                dfs(neighbour, node, answer, i + 1);
            }
        }
    }
}
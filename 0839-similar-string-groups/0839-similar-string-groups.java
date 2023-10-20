class Solution {
    public int numSimilarGroups(String[] strs) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            for(int j = i + 1; j < strs.length; j++){
                if(check(strs[i], strs[j])){
                    map.computeIfAbsent(i, a -> new ArrayList<Integer>()).add(j);
                    map.computeIfAbsent(j, a -> new ArrayList<Integer>()).add(i);
                }
            }
        }
        boolean[] visited = new boolean[strs.length];
        int answer = 0;
        for(int i = 0; i < strs.length; i++){
            if(!visited[i]){
                dfs(i, map, visited);
                answer++;
            }
        }
        return answer;
    }
    public boolean check(String a, String b){
        int diff = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)) diff++;
        }
        return diff == 0 || diff == 2;
    }
    public void dfs(int node, HashMap<Integer, List<Integer>> map, boolean[] visited){
        visited[node] = true;
        if(!map.containsKey(node)) return;
        for(int m : map.get(node)){
            if(!visited[m]){
                visited[m] = true;
                dfs(m, map, visited);
            }
        }
    }
}
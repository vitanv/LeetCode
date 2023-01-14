class Solution {
    int min;
    
    public void dfs(int index, Integer[][] adj, Integer[] visited, List<Integer> component){
        visited[index] = 1;
        component.add(index);
        min = Math.min(min, index);
        
        for(int i = 0; i < 26; i++){
            if(adj[index][i] != null && visited[i] == null) dfs(i, adj, visited, component);
        }
    }
    
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        Integer[][] adj = new Integer[26][26];
        for(int i = 0; i < s1.length();i++){
            adj[s1.charAt(i) - 'a'][s2.charAt(i) - 'a'] = 1;
            adj[s2.charAt(i) - 'a'][s1.charAt(i) - 'a'] = 1;
        }
        
        int[] mapping = new int[26];
        for(int i = 0; i < 26; i++) mapping[i] = i;
        
        Integer[] visited = new Integer[26];
        for(int i = 0; i < 26; i++){
            if(visited[i] == null){
                List<Integer> component = new ArrayList<>();
                min = 27;
                dfs(i, adj, visited, component);
                for(int j : component) mapping[j] = min;
            }
        }
        
        String answer = "";
        
        for(char c: baseStr.toCharArray()){
            answer = answer + (char)(mapping[c - 'a'] + 'a');
        }
        return answer;
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        Set<int[]> set = new HashSet<>();
        int count = 0;
        for(int [] s : stones){
            if(!set.contains(s)){
                dfs(s, set, stones);
                count++;
            }
        }
        return stones.length - count;
    }
    
    public void dfs(int[] s, Set<int[]> set, int[][] stones){
        set.add(s);
        for(int[] st: stones){
            if(!set.contains(st)){
                if(s[0] == st[0] || s[1] == st[1]) dfs(st, set, stones);
            }
        }
    }
}
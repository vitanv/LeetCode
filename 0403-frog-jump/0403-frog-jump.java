class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if(n == 0) return true;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>(n);
        map.put(0, new HashSet<Integer>());
        map.get(0).add(1);
        for(int i = 1; i < n; i++){
            map.put(stones[i], new HashSet<Integer>());
        }
        for(int i = 0; i < n - 1; i++){
            int stone = stones[i];
            for(int step: map.get(stone)){
                int reach = step + stone;
                if(reach == stones[n - 1]) return true;
                HashSet<Integer> set = map.get(reach);
                if(set != null){
                    if(step - 1 > 0) set.add(step - 1);
                    set.add(step);
                    set.add(step + 1);
                }
            }
        }
        return false;
    }
}
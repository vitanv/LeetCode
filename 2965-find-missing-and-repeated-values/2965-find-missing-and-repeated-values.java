class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] row: grid){
            for(int num: row){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int missing = 0, repeating = 0;
        for(int i = 1; i <= n * n; i++){
            if(!map.containsKey(i)){
                missing = i;
            }else if(map.get(i) == 2) {
                repeating = i;
            }
        }
        return new int[]{repeating, missing};
    }
}
class Solution {
    public int equalPairs(int[][] grid) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int[] row : grid){
            String rowString = Arrays.toString(row);
            map.put(rowString, map.getOrDefault(rowString,0) + 1);
        }
        for(int i = 0; i < grid.length; i++){
            int[] colArray = new int[grid.length];
            for(int j = 0; j < grid.length; j++){
                colArray[j] = grid[j][i];
            }
            answer += map.getOrDefault(Arrays.toString(colArray),0);
        }
        return answer;
    }
}
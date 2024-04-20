class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> answer = new ArrayList<>();
        
        for(int i = 0; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++){
                if(land[i][j] == 1 && (i == 0 || land[i - 1][j] == 0) && (j == 0 ||land[i][j - 1] == 0)){
                    int k = i, l = j;
                    while(k < land.length && land[k][j] == 1){
                        k++;
                    }
                    while(l < land[0].length && land[i][l] == 1){
                        l++;
                    }
                    answer.add(new int[]{i,j,k - 1, l - 1});
                }
            }
        }
        return answer.toArray(new int[0][]);
    }
}
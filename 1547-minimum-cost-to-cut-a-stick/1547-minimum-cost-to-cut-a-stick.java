class Solution {
    public int minCost(int n, int[] cuts) {
        List<Integer> list = new ArrayList<>();
        for(int cut : cuts){
            list.add(cut);
        }
        list.add(0);
        list.add(n);
        Collections.sort(list);
        int[][] dp = new int[list.size()][list.size()];
        for(int i = 2; i < list.size(); i++){
            for(int j = 0; j < list.size() - i; j++){
                dp[j][j + i] = Integer.MAX_VALUE;
                for(int k = j + 1; k < j + i; k++){
                    dp[j][j + i] = Math.min(dp[j][j + i], dp[j][k] + dp[k][j + i] + list.get(j + i) - list.get(j));
                }
            }
        }
        return dp[0][list.size() - 1];
    }
}
class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int[][] arr = new int[scores.length][2];
        Integer[][] dp = new Integer[scores.length][scores.length];
        for(int i = 0; i < scores.length; i++){
            arr[i][0] = ages[i];
            arr[i][1] = scores[i];
        }
        Arrays.sort(arr, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
       
        return max(dp, arr, -1, 0);
    }
    public int max(Integer[][] dp, int[][] arr, int prev, int index){
        if(index >= arr.length) return 0;
        if(dp[prev + 1][index] != null) return dp[prev+1][index];
        
        if(prev == -1 || arr[index][1] >= arr[prev][1]){
            return dp[prev+1][index] = Math.max(max(dp, arr, prev, index+1), arr[index][1] + max(dp,arr,index, index+1));
        }
        return dp[prev + 1][index] = max(dp, arr, prev, index + 1);
    }
}
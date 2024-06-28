class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long answer = 0, val = 1;
        long[] arr = new long[n];
        for(int[] road: roads){
            arr[road[0]]++;
            arr[road[1]]++;
        }
        Arrays.sort(arr);
        for(long a: arr){
            answer += val * a;
            val++;
        }
        return answer;
    }
}
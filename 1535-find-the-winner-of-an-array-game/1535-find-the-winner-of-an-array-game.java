class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length,answer = arr[0], count = 0;
        if(n <= k){
            for(int a : arr){
                answer = Math.max(a, answer);
            }
            return answer;
        }
        for(int i = 1; i < n; i++){
            if(answer > arr[i]){
                count++;
            }else{
                count = 1;
                answer = arr[i];
            }
            if(count == k) return answer;
        }
        return answer;
    }
}
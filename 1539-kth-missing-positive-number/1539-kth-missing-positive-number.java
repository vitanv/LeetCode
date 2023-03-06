class Solution {
    public int findKthPositive(int[] arr, int k) {
        int answer = 1, count = 0, index = 0;
        while(index < arr.length){
            if(arr[index] == answer){
                index++;
                answer++;
            }else{
                count++;
                if(count == k) return answer;
                answer++;
            }
        }
        return answer + (k - count - 1);
    }
}
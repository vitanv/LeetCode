class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start = 0, end = 0, answer = -1;
        for(int b : bloomDay){
            end = Math.max(end, b);
        }
        while(start <= end){
            int mid = (start + end) / 2;
            if(count(bloomDay,mid, k) >= m){
                answer = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return answer;
    }
    public int count(int[] bloomDay, int mid, int k){
        int result = 0, count = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                count++;
            }else{
                count = 0;
            }
            if(count == k){
                result++;
                count = 0;
            }
        }
        return result;
    }
}
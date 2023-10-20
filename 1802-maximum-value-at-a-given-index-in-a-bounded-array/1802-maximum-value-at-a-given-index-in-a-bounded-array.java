class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int left = 1, right = maxSum;
        while(left < right){
            int mid = (left + right + 1)/2;
            if(sum(index, mid, n) <= maxSum){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
    public long sum(int index, int mid, int n){
        long count = 0;
        if(mid > index){
            count += (long)(2 * mid - index) * (index + 1) / 2;
        }else{
            count +=(long)(mid + 1) * mid / 2 +index - mid + 1;
        }
        if(mid >= n - index){
            count += (long)(2 * mid - n + 1 + index) * (n - index) /2;
        }else{
            count += (long)(mid + 1) * mid/ 2 + n - index - mid;
        }
        return count - mid;
    }
}
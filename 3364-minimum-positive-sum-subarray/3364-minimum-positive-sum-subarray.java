class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size(), answer = Integer.MAX_VALUE, sum = 0;
        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = i; j < n; j++){
                if(j - i + 1 >= l && j - i + 1 <= r){
                    sum = 0;
                    for(int num : nums.subList(i, j + 1)){
                        sum += num;
                    }
                    if(sum < answer && sum > 0) answer = sum;
                }
            }
        }
        if(answer == Integer.MAX_VALUE) return -1;
        return answer;
    }
}
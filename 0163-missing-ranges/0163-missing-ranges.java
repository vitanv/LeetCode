class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> answer = new ArrayList<>();
        if(nums.length == 0){ 
            answer.add(Arrays.asList(lower, upper));
            return answer;
        }
        int n = nums.length;
        if(nums[0] > lower ) answer.add(Arrays.asList(lower, nums[0] - 1));
        for(int i = 1; i < n; i++){
            if(nums[i] - nums[i - 1] > 1){
                answer.add(Arrays.asList(nums[i - 1] +1, nums[i] - 1));
            }
        }
        if(upper > nums[n - 1] ) answer.add(Arrays.asList(nums[n - 1] + 1, upper));
        return answer;
    }
}
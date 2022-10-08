class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        if(nums.length <= 3){
            for(int n : nums){
                sum += n;
            }
            return sum;
        }
        sum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int currSum = nums[i] + nums[left] + nums[right];
                if(currSum == target) return currSum;
                if(Math.abs(target - currSum) < Math.abs(target-sum)) {
                    
                    sum = currSum;
                }
                if(target < currSum) right--;
                if(target > currSum) left++;
            }
        }
        
        return sum;
    }
}
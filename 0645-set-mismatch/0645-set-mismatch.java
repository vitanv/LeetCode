class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0, sqsum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i] - (i + 1);
            sqsum += nums[i]* nums[i] - ((i+1)*(i+1));
        }
        int diff = sum;
        sum = sqsum/sum;
        return new int[]{(sum+diff)/2,sum - ((sum+diff)/2)};
    }
}
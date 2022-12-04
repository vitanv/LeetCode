class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sumRight = 0, sumLeft = 0, countRight = 0, countLeft = 0, min = Integer.MAX_VALUE, answer = 0;
        for (long n : nums){
            sumRight += n;
            countRight++;
        }
        for(int i = 0; i < nums.length; i++){
            sumLeft += nums[i];
            sumRight -= nums[i];
            countRight--;
            countLeft++;
            long avgLeft = sumLeft/countLeft;
            long avgRight = sumRight;
            if(i != nums.length - 1){
                avgRight /= countRight;
            }
            long avg = Math.abs(avgLeft - avgRight);
            if(min > avg){
                min = avg;
                answer = i;
            }
        }
        return (int)answer;
    }
}
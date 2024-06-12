class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0, ones = 0;
        for(int num : nums){
            switch(num){
                case 0:
                    zeroes++;
                    break;
                case 1:
                    ones++;
                    break;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(zeroes > 0){
                nums[i] = 0;
                zeroes--;
            }else if(ones > 0){
                nums[i] = 1;
                ones--;
            }else{
                nums[i] = 2;
            }
        }

    }
}
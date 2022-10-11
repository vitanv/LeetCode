class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE, j = Integer.MAX_VALUE;
        for(int n : nums){
            if(n <= i){
                i = n;
            }else if(n <= j){
                j = n;
            }else{
                return true;
            }
        }
        return false;
    }
}
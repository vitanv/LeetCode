class Solution {
    public int[] findErrorNums(int[] nums) {
        int missing = 0, extra = 0;
        int[] arr = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0) missing = i;
            if(arr[i] == 2) extra = i; 
        }
        return new int[]{extra, missing};
    }
}
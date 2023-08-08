class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = 0, middle = 0, n = nums.length;
        for(int i = n - 2; i >= 0; i--){
            if(nums[n - 1] < nums[i]){
                right = i + 1;
                break;
            }
        }
        if(target > nums[n - 1]){
            right--;
        }else{
            left =  right;
            right = n - 1;
        }
        while(left <= right){
            middle = (right - left)/2 + left;
            if(nums[middle] == target) return middle;
            if(nums[middle] > target){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
            
        }
        return - 1;
    }
}
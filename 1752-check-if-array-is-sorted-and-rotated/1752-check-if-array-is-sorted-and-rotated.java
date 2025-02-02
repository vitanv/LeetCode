class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for(int i = 0; i < n; i ++){
            boolean match = true;
            for(int j = 0; j < n; j++){
                if(nums[(i + j) % n] != sorted[j]){
                    match = false;
                    break;
                }
            }
            if(match) return true;
        }
        return false;
    }
}
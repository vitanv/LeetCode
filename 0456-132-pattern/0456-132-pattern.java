class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length < 3) return false;
        int n = nums.length;
        int[] min = new int[n];
        Stack<Integer> stack = new Stack<>();
        min[0] = nums[0];
        for(int i = 1; i < n; i++){
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] > min[i]){
                while(!stack.isEmpty() && stack.peek() <= min[i]){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() < nums[i]) return true;
                stack.push(nums[i]);
            }
        }
        return false;
    }
}
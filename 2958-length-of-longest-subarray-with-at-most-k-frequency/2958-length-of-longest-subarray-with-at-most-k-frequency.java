class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int answer = 0, left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int  right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) +1);
            while(map.get(nums[right]) > k){
                map.put(nums[left],map.get(nums[left]) - 1);
                left++;
            }
            answer = Math.max(answer, right - left);
        }
        return answer + 1;
    }
}
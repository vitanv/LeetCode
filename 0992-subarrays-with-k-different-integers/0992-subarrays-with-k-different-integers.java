class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindow(k, nums) - slidingWindow(k - 1, nums);
    }
    private int slidingWindow(int k, int[] nums){
        int left = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(map.size() > k){
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
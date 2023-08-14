class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largests = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < nums.length;i++) largests.offer(nums[i]);
        while(k > 1){
            largests.poll();
            k--;
        }
        return largests.poll();
    }
}
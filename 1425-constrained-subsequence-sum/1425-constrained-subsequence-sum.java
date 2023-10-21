class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int answer = nums[0];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        pq.add(new int[]{nums[0], 0});
        for(int i = 1; i < nums.length; i++){
            while(i - pq.peek()[1] > k) pq.remove();
            int temp =  Math.max(0, pq.peek()[0]) + nums[i];
            answer = Math.max(answer,temp);
            pq.add(new int[]{temp, i});
        }
        return answer;
    }
}
class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] pairs = new int[nums1.length][2];
        for(int i = 0; i < nums1.length;i++){
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }
        Arrays.sort(pairs, (a,b) -> b[1] - a[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long sum = 0;
        for(int i = 0; i < k; i++){
            sum += pairs[i][0];
            pq.add(pairs[i][0]);
        }
        long answer = sum * pairs[k - 1][1];
        for(int i = k; i < nums1.length; i++){
            sum += pairs[i][0] - pq.poll();
            pq.add(pairs[i][0]);
            answer = Math.max(answer, sum * pairs[i][1]);
        }
        return answer;
    }
}
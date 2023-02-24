class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b - a));
        int min = Integer.MAX_VALUE, answer = Integer.MAX_VALUE;
        for(int num: nums){
            if(num % 2 == 1) num *= 2;
            pq.offer(num);
            min = Math.min(min, num);
        }
        while(true){
            int max = pq.poll();
            answer = Math.min(answer, max - min);
            if(max % 2 == 1) break;
            max /= 2;
            min = Math.min(min, max);
            pq.offer(max);
        }
        return answer;
    }
}
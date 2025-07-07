class Solution {
    public int maxEvents(int[][] events) {
        int day = 0, index = 0, answer = 0, n = events.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        while(!pq.isEmpty() || index < n){
            if(pq.isEmpty()) day = events[index][0];
            while(index < n && events[index][0] <= day){
                pq.offer(events[index][1]);
                index++;
            }
            pq.poll();
            answer++;
            day++;
            while(!pq.isEmpty() && pq.peek() < day) pq.poll();
        }
        return answer;
    }
}
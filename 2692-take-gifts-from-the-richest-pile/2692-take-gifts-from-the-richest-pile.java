class Solution {
    public long pickGifts(int[] gifts, int k) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b - a));
        for(int gift: gifts){
            pq.add(gift);
        }
        while(k > 0){
            pq.add((int)Math.sqrt((pq.remove())));
            k--;
        }
        while(pq.size() > 0){
            answer += pq.remove();
        }
        return answer;
    }
}
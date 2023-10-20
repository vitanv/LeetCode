class Solution {
    public int minStoneSum(int[] piles, int k) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int p : piles){
            q.add(p);
        }
        while(k > 0){
            int temp = q.poll();
            int diff  = temp / 2;
            q.add(temp - diff);
            k--;
        }
        for(int i : q){
            answer += i;
        }
        return answer;
    }
}
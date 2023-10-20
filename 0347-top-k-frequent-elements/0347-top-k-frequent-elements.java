class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()){
            pq.add(key);
            if (pq.size() > k) pq.poll();
        }
        int[] answer = new int[k];
        while(k > 0){
            answer[k - 1] = pq.poll();
            k--;
        }
        return answer;
    }
}
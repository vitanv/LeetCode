class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        StringBuilder answer = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry entry = pq.poll();
            for(int i = 0; i < (int)entry.getValue(); i++){
                answer.append(entry.getKey());
            }
        }
        return answer.toString();
    }
}
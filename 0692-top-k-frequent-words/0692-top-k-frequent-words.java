class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> answer = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue()
        );
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            pq.offer(entry);
        }
        for(int i = 0; i < k; i++){
            answer.add(pq.poll().getKey());
        }
        return answer;
    }
}
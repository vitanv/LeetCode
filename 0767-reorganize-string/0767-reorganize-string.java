class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            int count = map.getOrDefault(c, 0) + 1;
            if(count > (s.length() + 1) / 2) return "";
            map.put(c, count);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(char c: map.keySet()){
            pq.add(new int[]{c, map.get(c)});
        }
        StringBuilder answer = new StringBuilder();
        while(!pq.isEmpty()){
            int[] first = pq.poll();
            if(answer.length() == 0 || first[0] != answer.charAt(answer.length() - 1)){
                answer.append((char) first[0]);
                first[1]--;
                if(first[1] > 0){
                    pq.add(first);
                }
            }else{
                int[] second = pq.poll();
                answer.append((char) second[0]);
                second[1]--;
                if(second[1] > 0){
                    pq.add(second);
                }
                pq.add(first);
            }
        }
        return answer.toString();
    }
}
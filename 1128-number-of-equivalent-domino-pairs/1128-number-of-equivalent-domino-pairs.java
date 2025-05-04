class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] domino: dominoes){
            int key = Math.min(domino[0],domino[1]) * 10 + Math.max(domino[0],domino[1]);
            map.put(key, map.getOrDefault(key,0) + 1);
        }
        int answer = 0;
        for(int key: map.keySet()){
            answer += map.get(key) *(map.get(key) - 1) / 2;
        }
        return answer;
    }
}
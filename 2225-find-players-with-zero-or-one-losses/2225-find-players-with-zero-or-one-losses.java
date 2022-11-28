class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] m : matches){
            map.put(m[0], map.getOrDefault(m[0],0));
            map.put(m[1], map.getOrDefault(m[1],0) + 1);
        }
        List answer0 = new ArrayList<Integer>();
        List answer1 = new ArrayList<Integer>();
        for(Integer key: map.keySet()){
            if(map.get(key) == 0) answer0.add(key);
            if(map.get(key) == 1) answer1.add(key);
        }
        List<List<Integer>> answer = new ArrayList<>();
        Collections.sort(answer0);
        Collections.sort(answer1);
        answer.add(answer0);
        answer.add(answer1);
        return answer;
    }
}
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        for(int key: map.keySet()){
            int count = map.get(key);
            answer += count * (count - 1) / 2;
        }
        return answer;
    }
}
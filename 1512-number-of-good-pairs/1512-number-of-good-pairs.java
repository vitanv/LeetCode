class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int num: nums){
            answer += map.getOrDefault(num,0);
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        
        return answer;
    }
}
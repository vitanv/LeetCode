class Solution {
    public int minOperations(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int value: map.values()){
            if(value == 1) return -1;
            if(value % 3 == 0){
                answer += value / 3;
            }else{
                answer += value / 3 + 1;
            }
            
        }
        return answer;
    }
}
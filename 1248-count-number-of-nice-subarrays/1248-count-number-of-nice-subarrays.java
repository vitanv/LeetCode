class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int answer = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i] % 2;
            if(map.containsKey(sum - k)) answer += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return answer;
    }
}
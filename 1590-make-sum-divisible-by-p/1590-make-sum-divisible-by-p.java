class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length , sum = 0, curr = 0, answer = n;
        for(int num: nums){
            sum = (sum + num) % p;
        }
        int target = sum % p;
        if(target == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < n; i++){
            curr = (curr + nums[i]) % p;
            int needed = (curr - target + p) % p;
            if(map.containsKey(needed)){
                answer = Math.min(answer, i - map.get(needed));
            }
            map.put(curr, i);
        }
        if(answer == n) return -1;
        return answer;
    }
}
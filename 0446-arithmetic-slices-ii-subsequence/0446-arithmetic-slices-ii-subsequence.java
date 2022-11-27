class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        long answer = 0;
        HashMap<Long, Integer> [] maps = new HashMap[nums.length];
        for(int i = 0; i < nums.length; i++){
            maps[i] = new HashMap<>(i);
            for(int j = 0; j < i; j++){
                long diff = (long)nums[i] - (long)nums[j];
                
                int sum = maps[j].getOrDefault(diff, 0);
                maps[i].put(diff, maps[i].getOrDefault(diff, 0) + sum + 1);
                answer += sum;
            }
        }
        return (int)answer;
    }
}
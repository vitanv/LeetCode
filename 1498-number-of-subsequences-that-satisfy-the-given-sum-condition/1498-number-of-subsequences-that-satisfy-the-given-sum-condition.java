class Solution {
    public int numSubseq(int[] nums, int target) {
        int answer = 0, mod = 1000000007, left = 0, right = nums.length - 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 1; i<= nums.length; i++){
            list.add((list.get(i- 1) << 1) % mod);
        }
        Arrays.sort(nums);
        while(left <= right){
            if(nums[left] + nums[right] > target){
                right--;
            }else{
                answer = (answer + list.get(right - left)) % mod;
                left++;
            }
        }
        return answer;
    }
}
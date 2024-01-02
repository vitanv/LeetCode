class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int count = nums.length;
        while(count > 0){
            List<Integer> list = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < nums.length;i++){
                if(nums[i] != -1 && !set.contains(nums[i])){
                    list.add(nums[i]);
                    set.add(nums[i]);
                    count--;
                    nums[i] = -1;
                }
            }
            answer.add(list);
        }
        return answer;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int[] compare = new int[nums.length + 1];
        for(int num : nums){
            compare[num]++;
        }
        for(int i = 1; i < compare.length;i++){
            if(compare[i] == 0) answer.add(i);
        }
        return answer;
    }
}
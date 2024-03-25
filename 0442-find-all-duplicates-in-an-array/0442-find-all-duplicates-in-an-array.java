class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for(int num: nums){
            freq[num]++;
        }
        for(int i = 1; i < freq.length; i++){
            if(freq[i] == 2) answer.add(i);
        }
        return answer;
    }
}
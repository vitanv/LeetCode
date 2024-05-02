class Solution {
    public int findMaxK(int[] nums) {
        int answer = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int num: nums){
            if(num > 0 && set.contains(num * -1)){
                answer = Math.max(answer, num);
            }
        }
        return answer;
    }
}
class Solution {
    public int repeatedNTimes(int[] nums) {
        int answer = 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int num: nums){
            if(seen.contains(num)){
                answer = num;
                break;
            }
            seen.add(num);
        }
        return answer;
    }
}
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            Character c = nums[i].charAt(i);
            answer.append(c == '0' ? '1' : '0');
        }
        
        return answer.toString();
    }
}
class Solution {

    public int minElement(int[] nums) {
        int answer = 37;
        for (int num : nums) {
            int n = 0;
            while (num > 0) {
                n += num % 10;
                num /= 10;
            }
            answer = Math.min(answer, n);
        }
        return answer;
    }
}
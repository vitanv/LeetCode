class Solution {

    public int missingMultiple(int[] nums, int k) {
        int answer = k;
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        };
        while (seen.contains(answer)) {
            answer += k;
        }
        return answer;
    }
}
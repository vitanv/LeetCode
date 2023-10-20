class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(new ArrayList<>(), answer, nums);
        return answer;
    }
    
    public void backtrack(List<Integer> curr, List<List<Integer>> answer, int[] nums) {
        if (curr.size() == nums.length) {
            answer.add(new ArrayList<>(curr));
            return;
        }
        
        for (int num: nums) {
            if (!curr.contains(num)) {
                curr.add(num);
                backtrack(curr, answer, nums);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
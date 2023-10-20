class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> answer = new HashSet<>();
        List<Integer> sequence = new ArrayList<>();
        backtrack(nums, 0, sequence, answer);
        return new ArrayList(answer);
    }
    public void backtrack(int[] nums, int index, List<Integer> sequence, Set<List<Integer>> answer){
        if(index == nums.length){
            if(sequence.size() >= 2) answer.add(new ArrayList<>(sequence));
            return;
        }
        if(sequence.isEmpty() || sequence.get(sequence.size() - 1) <= nums[index]){
            sequence.add(nums[index]);
            backtrack(nums, index + 1, sequence, answer);
            sequence.remove(sequence.size() - 1);
        }
        backtrack(nums, index + 1, sequence, answer);
    }
}
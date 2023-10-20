class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(Arrays.asList(1)));
        for(int i = 1; i < numRows; i++){
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = answer.get(i - 1);
            curr.add(1);
            for(int j = 1; j < i; j++){
                curr.add(j,prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            answer.add(curr);
        }
        return answer;
    }
}
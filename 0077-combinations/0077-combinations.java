class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        combine(answer, new ArrayList<Integer>(),1, n, k);
        return answer;
    }
    public void combine(List<List<Integer>> answer, List<Integer> comb, int start, int n, int k){
        if(k == 0){
            answer.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i = start; i <= n; i++){
            comb.add(i);
            combine(answer, comb, i+1, n, k - 1);
            comb.remove(comb.size()-1);
        }
    }
}
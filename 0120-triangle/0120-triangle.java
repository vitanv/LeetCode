class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[] answer = new int[len+1];
        for(int i = len-1;i>=0;i--){
            for(int j = 0;j<triangle.get(i).size();j++){
                answer[j] = Math.min(answer[j], answer[j+1]) + triangle.get(i).get(j);
            }
        }
        return answer[0];
    }
}
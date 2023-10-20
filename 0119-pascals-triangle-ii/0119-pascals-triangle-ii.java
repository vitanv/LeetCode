class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = 0;i<=rowIndex;i++){
            answer.add(1);
            for(int j = i-1;j>0;j--){
                answer.set(j,answer.get(j-1)+answer.get(j));
            }
        }
        return answer;
    }
}
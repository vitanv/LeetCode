class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<>();
        int index = 0;
        for(int i = 1; i <= n; i++){
            answer.add("Push");
            if(i != target[index]){
                answer.add("Pop");
            }else{
                index++;
            }
            if(index == target.length) break;
        }
        return answer;
    }
}
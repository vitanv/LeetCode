class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int answer = 0;
        for(int l : left){
            answer = Math.max(answer, l);
        }
        for(int r : right){
            answer = Math.max(answer, n - r);
        }
        return answer;
    }
}
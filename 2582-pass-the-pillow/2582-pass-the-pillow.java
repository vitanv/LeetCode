class Solution {
    public int passThePillow(int n, int time) {
        int answer = 1;
        boolean reverse = false;
        while(time > 0){
            if(reverse){
                answer--;
            }else{
                answer++;
            }
            if(answer == 1 || answer == n) reverse = !reverse;
            time--;
        }
        return answer;
    }
}
class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0;
        for(char c : customers.toCharArray()){
            if(c == 'Y') penalty++;
        }
        int min = penalty, answer = 0;
        for(int i = 0; i < customers.length(); i++){
            if(customers.charAt(i) == 'Y'){
                penalty--;
            }else{
                penalty++;
            }
            if(min > penalty){
                answer = i + 1;
                min = penalty;
            }
        }
        return answer;
    }
}
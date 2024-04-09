class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int answer = 0, curr = 0;
        while(tickets[k] > 0){
            if(tickets[curr % tickets.length] == 0){
                curr++;
                continue;
            }
            tickets[curr % tickets.length]--;
            answer++;
            curr++;
        }
        return answer;
    }
}
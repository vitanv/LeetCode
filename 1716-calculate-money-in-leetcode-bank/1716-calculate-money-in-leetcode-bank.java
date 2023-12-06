class Solution {
    public int totalMoney(int n) {
        int answer = 0, monday = 1, money = 1;
        for(int i = 1; i <= n; i++){
            answer += money;
            money++;
            if(i % 7 == 0){
                monday++;
                money = monday;
            }
        }
        return answer;
    }
}
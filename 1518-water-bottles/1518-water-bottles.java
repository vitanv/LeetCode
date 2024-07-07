class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int answer = numBottles;
        while(numBottles >= numExchange){
            int rest = numBottles % numExchange;
            numBottles /= numExchange;
            answer += numBottles;
            numBottles += rest;
        }
        return answer;
    }
}
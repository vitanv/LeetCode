class Solution {
    public boolean canAliceWin(int n) {
        int stones = 10, turns = 0;
        while(n >= stones){
            n -= stones;
            stones--;
            turns++;
        }
        return turns % 2 == 1;
    }
}
class Solution {
    public long coloredCells(int n) {
        long answer = 1, cells = 4;
        while(n > 1){
            answer += cells;
            cells += 4;
            n--;
        }
        return answer;
    }
}
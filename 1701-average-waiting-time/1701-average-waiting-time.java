class Solution {
    public double averageWaitingTime(int[][] customers) {
        int idle = 0;
        long wait = 0;
        for(int i = 0; i < customers.length; i++){
            idle = Math.max(idle,customers[i][0]) + customers[i][1];
            wait += idle - customers[i][0];
        }
        return (double)wait/ customers.length;
    }
}
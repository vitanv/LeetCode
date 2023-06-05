class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0],x1 = coordinates[1][0],y0 = coordinates[0][1],y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for(int[] c : coordinates){
            int x = c[0], y =c[1];
            if(dx * (y-y1) != dy * (x-x1)) return false;
        }
        return true;
    }
}
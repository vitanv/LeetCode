class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(Math.abs(sx - fx) == 0 && Math.abs(sy - fy) == 0 && t == 1) return false;
        return Math.max(Math.abs(sx - fx), Math.abs(sy - fy)) <= t;
    }
}
class Solution {
    public int countOdds(int low, int high) {
        if((high - low + 1) % 2 == 0) return (high - low + 1) /2;
        if((high % 2 == 0) || (low % 2 == 0)) return (high - low + 1) /2 ;
        return (high - low + 1) /2 +1;
    }
}
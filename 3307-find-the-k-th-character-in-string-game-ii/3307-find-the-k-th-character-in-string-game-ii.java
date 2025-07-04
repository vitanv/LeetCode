class Solution {
    public char kthCharacter(long k, int[] operations) {
        int answer = 0, n = operations.length;
        k--;
        for(int i = 0; i < n && i < 60; i++){
            if((k >> i) % 2 > 0) answer += operations[i];
        }
        return (char)('a' + answer % 26);
    }
}
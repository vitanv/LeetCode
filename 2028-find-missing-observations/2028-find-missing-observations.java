class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] answer= new int[n];
        int sum = 0, m = rolls.length, index = 0;
        for(int roll: rolls){
            sum += roll;
        }
        int totalMissing = (mean*(n + m) - sum);
        if((double)totalMissing / n > 6 || totalMissing < n) return new int[0];
        Arrays.fill(answer, 1);
        while(totalMissing > n){
            answer[index]++;
            
            totalMissing--;
            if(answer[index] == 6) index++;
        }
        return answer;
    }
}
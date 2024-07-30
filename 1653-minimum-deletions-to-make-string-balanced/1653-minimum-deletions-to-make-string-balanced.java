class Solution {
    public int minimumDeletions(String s) {
        int n = s.length(), countA = 0, countB = 0;
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        
        for(int i = 0; i < n; i++){
            arrayB[i] = countB;
            if(s.charAt(i) == 'b') countB++;
        }
        for(int i = n - 1; i >= 0; i--){
            arrayA[i] = countA;
            if(s.charAt(i) == 'a') countA++;
        }
        int answer = n;
        for(int i = 0; i < n; i++){
            answer = Math.min(answer, arrayA[i] + arrayB[i]);
            
        }
        return answer;
    }
}
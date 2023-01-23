class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> trusting = new HashSet<>();
        int[] trusted = new int[n];
        Arrays.fill(trusted, 0);
        for(int[] t : trust){
            trusting.add(t[0]);
            trusted[t[1] - 1]++;
        }
        for(int i = 0; i < n; i++){
            if(trusted[i] == n - 1 && !trusting.contains(i+1)) return i+1;
        }
        return - 1;
    }
}
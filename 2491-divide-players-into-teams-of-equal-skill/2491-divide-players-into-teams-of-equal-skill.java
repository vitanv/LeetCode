class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        long answer = 0;
        Arrays.sort(skill);
        int target = skill[0] + skill[n - 1];
        for(int i = 0; i < n/ 2; i++){
            int curr = skill[i] + skill[n - i - 1];
            if(curr != target) return -1;
            answer += (long) skill[i] * (long)skill[n - i - 1];
        }
        return answer;
    }
}
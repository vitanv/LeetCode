class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int answer = 0, n = garbage.length;
        HashSet<Character> set = new HashSet<>();
        for(int i = n - 1; i >= 0; i--){
            for(char c: garbage[i].toCharArray()){
                if(!set.contains(c)) set.add(c);
            }
            answer += garbage[i].length();
            if(i > 0) answer += set.size() * travel[i - 1];
        }
        return answer;
    }
}
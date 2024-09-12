class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = 0;
        Set<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray()){
            set.add(c);
        }
        for(String word: words){
            boolean check = true;
            for(char c: word.toCharArray()){
                if(!set.contains(c)) {
                    check = false;
                    break;
                }
            }
            if(check) answer++;
        }
        return answer;
    }
}
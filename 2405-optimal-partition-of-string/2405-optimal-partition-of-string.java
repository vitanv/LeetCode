class Solution {
    public int partitionString(String s) {
        int answer = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                set.clear();
                answer++;
                set.add(c);
            }else{
                set.add(c);
            }
        }
        return answer+1;
    }
}
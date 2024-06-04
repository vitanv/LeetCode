class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int answer = 0, center =0;
        for(char key: map.keySet()){
            if(map.get(key) % 2 == 1){
                center = 1;
                answer += map.get(key) - 1;
            }else{
                answer += map.get(key);
            }
        }
        return answer + center;
    }
}
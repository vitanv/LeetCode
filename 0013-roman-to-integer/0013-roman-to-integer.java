class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i = s.length()-1; i >= 0; i--){
            int curr = map.get(s.charAt(i));
            answer += curr;
            while(i > 0 && curr > map.get(s.charAt(i-1))){
                i--;
                answer -= map.get(s.charAt(i));
            }
        }
        return answer;
    }
}
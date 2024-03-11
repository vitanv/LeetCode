class Solution {
    public String customSortString(String order, String s) {
        String answer = "";
        Character[] arr = new Character[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, (Character a,Character b) -> order.indexOf(a) - order.indexOf(b));
        for(Character c: arr){
            answer += c;
        }
        return answer;
    }
}
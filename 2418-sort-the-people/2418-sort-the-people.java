class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] answer = new String[names.length];
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i < names.length; i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i = 0; i < names.length; i++){
            answer[names.length - 1 - i] = map.get(heights[i]);
        }
        return answer;
    }
}
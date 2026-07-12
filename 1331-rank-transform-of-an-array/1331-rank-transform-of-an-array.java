class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length, rank = 0;
        int[] dummy = new int[n];
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            dummy[i] = arr[i];
        }
        Arrays.sort(dummy);
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!set.contains(dummy[i])){
                set.add(dummy[i]);
                rank++;
                map.put(dummy[i], rank);
            }
        }
        for(int i = 0; i < n; i++){
            answer[i] = map.get(arr[i]);
        }
        return answer;
    }
}
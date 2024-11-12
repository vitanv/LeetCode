class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int max = items[0][1];
        for(int i = 0; i < items.length; i++){
            max = Math.max(max, items[i][1]);
            items[i][1] = max;
        }
        for(int i = 0; i < queries.length; i++){
            answer[i] = search(items, queries[i]);
        }
        return answer;
    }
    public int search(int[][] items, int target){
        int left = 0, right = items.length - 1, max = 0;
        while(left <= right){
            int mid =(left + right) / 2;
            if(items[mid][0] > target){
                right = mid - 1;
            }else{
                max = Math.max(max, items[mid][1]);
                left = mid + 1;
            }
        }
        return max;
    }
}
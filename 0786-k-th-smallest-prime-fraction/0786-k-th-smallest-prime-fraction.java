class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] answer = null;
        HashMap<Integer, int[]> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> (double) a[0] / a[1]));
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                pq.offer(new int[]{arr[i], arr[j]});
                
            }
        }
        while(k > 0){
            answer = pq.poll();
            k--;
        }
        return answer;
    }
}
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int[] count = new int[n];
        long[] availability = new long[n];
        Arrays.sort(meetings, (a,b) -> a[0] - b[0]);
        for(int[] meeting : meetings){
            boolean freeRoom = false;
            int start = meeting[0];
            int end = meeting[1];
            long minTimeAvailble = Long.MAX_VALUE;
            int roomAvailble = 0;
            for(int i = 0; i < n; i++){
                if(availability[i] <= start){
                    freeRoom = true;
                    count[i]++;
                    availability[i] = end;
                    break;
                }
                if(minTimeAvailble > availability[i]){
                    minTimeAvailble =availability[i];
                    roomAvailble = i;
                }
            }
           if(!freeRoom){
               availability[roomAvailble] += end - start;
               count[roomAvailble]++;
           } 
        }
        int answer = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(count[i] > max){
                max = count[i];
                answer = i;
            }
        }
        return answer;
    }
}
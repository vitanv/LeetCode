class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int answer = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0; i < seats.length; i++){
            answer += Math.abs(seats[i] - students[i]);
        }
        return answer;
    }
}
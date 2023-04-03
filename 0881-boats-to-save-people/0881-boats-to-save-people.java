class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length - 1, answer = 0;
        while(left <= right){
            answer++;
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
        }
        return answer;
    }
}
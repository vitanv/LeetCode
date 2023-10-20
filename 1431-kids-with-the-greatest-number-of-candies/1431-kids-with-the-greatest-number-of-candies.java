class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = 0;
        for(int c : candies){
            max = Math.max(c, max);
        }
        for(int c : candies){
            if(c + extraCandies >= max){
                answer.add(true);
            }else{
                answer.add(false);
            }
        }
        return answer;
    }
}
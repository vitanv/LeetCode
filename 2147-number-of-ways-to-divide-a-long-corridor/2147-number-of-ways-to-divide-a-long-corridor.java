class Solution {
    public int numberOfWays(String corridor) {
        long mod = 1000000007, seats = 0, plants = 0, answer = 1;
        for(char c : corridor.toCharArray()){
            if(c == 'S'){
                seats++;
                if(seats % 2 == 0 && seats > 0){
                    answer *= (plants + 1);
                    answer %= mod;
                    plants = 0;
                }
            }else if(seats % 2 == 0 && seats > 0){
                plants++;
            }
        }
        if(seats % 2 != 0 || seats == 0) return 0;
        return (int)answer;
     }
}
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int answer = 0;
        for(int i = low; i <= high; i++){
            if(i < 100 && i % 11 == 0){
                answer++;
            }else if(1000 <= i && i < 10000){
                int left = i / 1000 + (i % 1000)/ 100;
                if((i / 1000 + (i % 1000)/ 100) ==  ((i % 100) / 10 + (i % 10))) answer++;
            }
        }
        return answer; 
    }
}
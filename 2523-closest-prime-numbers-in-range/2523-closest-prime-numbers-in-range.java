class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int num = left; num <= right; num++){
            if(isPrime(num)) list.add(num);
        }
        int[] answer = new int[]{-1, -1};
        if(list.size() < 2) return answer;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <list.size(); i++){
            int gap = list.get(i) - list.get(i - 1);
            if(gap < min){
                min = gap;
                answer[0] = list.get(i - 1);
                answer[1] = list.get(i);
            }        
        }
        return answer;
    }
    public boolean isPrime(int num){
        if(num <= 1) return false;
        if(num <= 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5; i * i <= num; i += 6){
            if(num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
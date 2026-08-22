class Solution {
    public boolean checkDivisibility(int n) {
        int sum = n % 10, product = n % 10, r = n / 10;
        while(r > 0){
            sum+= r % 10;
            product *= r % 10;
            r /= 10;
        }
        return n % (sum + product) == 0;
    }
}
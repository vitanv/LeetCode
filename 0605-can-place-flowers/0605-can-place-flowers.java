class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;
        if(flowerbed.length == 1) return flowerbed[0] == 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if((i - 1 < 0 ||flowerbed[i - 1] == 0) && (i + 1 == flowerbed.length ||flowerbed[i + 1] == 0) ){
                    flowerbed[i] = 1;
                    n--;
                    if(n == 0) return true;
                }
            }
        }
        return false;
    }
}
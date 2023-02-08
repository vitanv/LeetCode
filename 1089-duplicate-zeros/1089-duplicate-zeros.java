class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0, len = arr.length - 1;
        for(int i = 0; i <= len - zeros; i++){
            if(arr[i] == 0){
                if(i == len - zeros){
                    arr[len] = 0;
                    len --;
                    break;
                }
                zeros++;
            }
        }
        
        int last = len - zeros;
        for(int i = last; i >= 0; i--){
            if(arr[i] == 0){
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            }else{
                arr[i + zeros] = arr[i];
            }
        }
    }
}
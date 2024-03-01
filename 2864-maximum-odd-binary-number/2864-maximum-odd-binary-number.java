class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(int i = 0; i < n/2; i++){
            char c = arr[i];
            arr[i] = arr[n - 2 - i];
            arr[n - 2 - i] = c;
        }
        return new String(arr);
    }
}
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length, answer = 0;
        int[] arr = new int[n + k - 1];
        System.arraycopy(colors, 0, arr, 0, n);
        System.arraycopy(colors, 0, arr, n, k - 1);
        for(int left = 0, right = 0; right < arr.length; right++){
            if(right > 0 && arr[right] == arr[right - 1]) left = right;
            if(right - left + 1 >= k) answer++;
        }
        return answer;
    }
}
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white = 0, min = Integer.MAX_VALUE;
        for(int left = 0, right = 0; right < blocks.length(); right++){
            if(blocks.charAt(right) == 'W') white++;
            if(right - left + 1 == k){
                min = Math.min(min, white);
                if(blocks.charAt(left) == 'W') white--;
                left++;
            }
        }
        return min;
    }
}
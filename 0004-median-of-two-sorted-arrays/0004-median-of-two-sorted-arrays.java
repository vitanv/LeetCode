class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int median1 = 0, median2 = 0, idx1 = 0, idx2 = 0, n = nums1.length, m = nums2.length;
        for(int i = 0; i <= (n + m)/2; i++){
            median1 = median2;
            if(idx1 == n){
                median2 = nums2[idx2];
                idx2++;
            }else if(idx2 == m){
                median2 = nums1[idx1];
                idx1++;
            }else if(nums1[idx1] < nums2[idx2]){
                median2 = nums1[idx1];
                idx1++;
            }else{
                median2 = nums2[idx2];
                idx2++;
            }
        }
        if((n + m) % 2 == 0) return (double)(median1 + median2)/2;
        return median2;
    }
}
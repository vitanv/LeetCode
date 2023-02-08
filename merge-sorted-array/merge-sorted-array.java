class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1, i = n + m -1;
        while(index1 >= 0 && index2 >= 0){
            if(nums1[index1] > nums2[index2]){
                nums1[i] = nums1[index1];
                i--;
                index1--;
            }else if(nums2[index2] > nums1[index1]){
                nums1[i] = nums2[index2];
                i--;
                index2--;
            }else{
                nums1[i] = nums1[index1];
                i--;
                index1--;
                nums1[i] = nums2[index2];
                i--;
                index2--;
            }
        }
        while(index2 >= 0){
                nums1[i] = nums2[index2];
                i--;
                index2--;
            }
    }
}
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left = 0, right = mountainArr.length() - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        int peak = left;
        left = 0; 
        right = peak;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mountainArr.get(mid) < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        if(mountainArr.get(left) == target) return left;
        left = peak + 1; 
        right = mountainArr.length() - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mountainArr.get(mid) > target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        if(mountainArr.get(left) == target) return left;
        return -1;
    }
}
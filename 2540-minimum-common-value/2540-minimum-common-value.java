class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
              int j = 0, i = 0;
        while (j<nums1.length& i<nums2.length){
            if (nums1[j]==nums2[i]) return nums1[j];
            if (nums1[j]>nums2[i]) i++;
            else j++;
        }
        return -1; 
    }
}
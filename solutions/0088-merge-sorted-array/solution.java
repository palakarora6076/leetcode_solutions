class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=nums1.length-1;
        while (n>=1 && m>=1){
            if (nums1[m-1]>nums2[n-1]){
                nums1[index]=nums1[m-1];
                index--;
                m--;
            }else{
                nums1[index]=nums2[n-1];
                n--;
                index--;
            }
        }
        if (m==0){
            for (int i=n-1;i>=0;i--){
                nums1[index]=nums2[i];
                index--;
            }  
        }
    }
}

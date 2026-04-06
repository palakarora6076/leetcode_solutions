class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int arr[]= new int[10];
        int min1=10;
        int min2=10;
        int singledig=10;
        for (int i=0;i<nums1.length;i++){
              arr[nums1[i]]=1;
              if (nums1[i]<min1){
                min1=nums1[i];
              }
        }
        for (int j=0;j<nums2.length;j++){
            if (arr[nums2[j]]==1 && nums2[j]<singledig){
                singledig=nums2[j];
            }
            if (nums2[j]<min2){
                min2=nums2[j];
            }
        }
        if (singledig!=10){
            return singledig;
        }else if(min2<min1){
            return min2*10+min1;
        }else{
            return min1*10+min2;
        }
    }
}

class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int arr1[]=new int[80001];
        int arr2[]=new int[80001];
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for (int i=0;i<nums1.length;i++){
            arr1[nums1[i]]=arr1[nums1[i]]+1;
            arr2[nums2[i]]=arr2[nums2[i]]+1;
            if (nums1[i]>nums2[i]){
                max= Math.max(nums1[i],max);
                min= Math.min(nums2[i],min);
            }else{
                max= Math.max(nums2[i],max);
                min= Math.min(nums1[i],min);
            }
        }
        double cost=0;
        for (int i=min;i<=max;i++){
            if (arr1[i]!=arr2[i]){
                int m=Math.abs(arr1[i]-arr2[i]);
                if (m%2!=0){
                    return -1;
                }else{
                    cost=cost+((0.5)*(m/2));
                }
            }
        }
        if (cost%0.5==0 && cost%1.0!=0){
            return -1;
        }
        int finalcost=(int) cost;
        return finalcost;
    }
}

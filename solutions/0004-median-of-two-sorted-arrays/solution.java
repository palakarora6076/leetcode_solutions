class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        if (m>n){
            return findMedianSortedArrays(nums2,nums1);
        }
        int low=0;
        int high=m;
        int l1=-1;
        int l2=-1;
        int r1=-1;
        int r2=-1;
        while (low<=high){
            int mid1=low+(high-low)/2;
            int mid2=(m+n+1)/2-mid1;
            if (mid1==0){
                l1=Integer.MIN_VALUE;
            }else{
                l1=nums1[mid1-1];
            }
            if (mid2==0){
                l2=Integer.MIN_VALUE;
            }else{
                l2=nums2[mid2-1];
            }
            if (mid1==m){
                r1=Integer.MAX_VALUE;
            }else{
                r1=nums1[mid1];
            }
            if (mid2==n){
                r2=Integer.MAX_VALUE;
            }else{
                r2=nums2[mid2];
            }

            if (l1<=r2 && l2<=r1){
                break;
            }else if(l1>r2){
                high=mid1-1;
            }else{
                low=mid1+1;
            }
        }
        if ((m+n)%2==0){
            return ((Math.max(l1,l2)+Math.min(r1,r2))/2.0);
        }else{
            return Math.max(l1,l2);
        }
    }
}


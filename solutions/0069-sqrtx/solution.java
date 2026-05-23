class Solution {
    public int mySqrt(int x) {
        int high=x;
        int low=0;
        int num=0;
        if (x==0 || x==1){
            return x;
        }
        while (low<=high && high<=x){
            int mid=low+(high-low)/2;
            if ((mid)<=x/mid){
                low=mid+1;
                num=mid;
            }else{
                high=mid-1;
            }
        }
        return num;
    }
}

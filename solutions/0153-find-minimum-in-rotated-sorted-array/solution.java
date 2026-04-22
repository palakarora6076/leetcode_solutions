class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        int minimum=nums[0];
        while (low<=high && high<nums.length){
            int mid=(low+high)/2;
            if (nums[mid]<minimum){
                minimum=nums[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return minimum;
    }
}

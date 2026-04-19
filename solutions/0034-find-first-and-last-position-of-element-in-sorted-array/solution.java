class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int count=0;
        int result[]={-1,-1};
        while (low<=high && high<nums.length){
            int mid=(high+low)/2;
            if (nums[mid]==target && count==0){
                result[1]=mid;
                result[0]=mid;
                high=mid-1;
                count++;
            }else if(nums[mid]==target){
                result[0]=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if (result[0]!=-1){
            low=result[0]+1;
            high=nums.length-1;
            while (low<=high && high<nums.length){
                int mid=(high+low)/2;
                if (nums[mid]==target){
                    result[1]=mid;
                    low=mid+1;
                }else{
                    high=mid-1;
                } 
            }
        }
        return result;
    }
}

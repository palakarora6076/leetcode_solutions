class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        if (nums[low]<nums[high]){
            while(low<=high && high<nums.length){
                int mid=(low+high)/2;
                if (nums[mid]==target){
                    return mid;
                }else if(nums[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }else{
            if (target<=nums[nums.length-1]){
                while (low<=high && high<nums.length){
                    int mid=(low+high)/2;
                    if (nums[mid]==target){
                        return mid;
                    }else if(nums[mid]>target && nums[mid]>nums[0]){
                        low=mid+1;
                    }else if(nums[mid]>target && nums[mid]<nums[0]){
                        high=mid-1;
                    }else{
                        low=mid+1;
                    }
                }
            }else if(target>=nums[0]){
                while (low<=high && high<nums.length){
                    int mid=(low+high)/2;
                    if (nums[mid]==target){
                        return mid;
                    }else if(nums[mid]<target && nums[mid]<nums[nums.length-1]){
                        high=mid-1;
                    }else if(nums[mid]<target && nums[mid]>nums[nums.length-1]){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
            }
        }
        return -1;
    }
}

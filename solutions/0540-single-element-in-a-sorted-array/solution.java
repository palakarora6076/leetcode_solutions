class Solution {
    public int singleNonDuplicate(int[] nums) {
       int low=0;
       int high=nums.length-1;
       int index,mid;
    while (low<=high){
         mid=low+(high-low)/2;
        if (mid==0 && nums[mid]!=nums[mid]+1){
            return nums[mid];
        }else if(mid==nums.length-1 && nums[mid]!=nums[mid-1]){
            return nums[mid];
        }else if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
            return nums[mid];
        }
        
        if (nums[mid-1]==nums[mid]){
            index=mid;
        }else{
            index=mid+1;
        }

        if (index%2==0){
            high=index-2;
        }else{
            low=index+1;
        }
    }
    return 0;
    }
}

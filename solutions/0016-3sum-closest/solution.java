import java.util.Arrays;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length==3) return nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int closest=Integer.MAX_VALUE;
        int ptr1=0;
        int ptr2=1;
        int ptr3=nums.length-1;
        while (ptr1!=nums.length-2){
            while (ptr2<ptr3){
                int sum=nums[ptr1]+nums[ptr2]+nums[ptr3];
                int close=Math.abs(sum-target);
                int minimum=Math.min(close,Math.abs(closest-target));
                if (minimum==close){
                    closest=sum;
                }
                if (sum==target){
                    return sum;
                }else if (sum>target){
                    ptr3--;
                }else{
                    ptr2++;
                }
            }
            ptr1++;
            ptr2=ptr1+1;
            ptr3=nums.length-1;
        }
        return closest;
    }
}

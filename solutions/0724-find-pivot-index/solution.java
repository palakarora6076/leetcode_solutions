class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        for (int i=0;i<nums.length;i++){
            rightsum+=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            if (leftsum==rightsum-nums[i]){
                return i;
            }
            rightsum-=nums[i];
            leftsum=leftsum+nums[i];
        }
        return -1;
    }
}

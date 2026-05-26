class Solution {
    public int removeDuplicates(int[] nums) {
        int num=nums[0];
        int index=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=num){
                nums[index]=nums[i];
                num=nums[i];
                index++;
            }
        }
        return index;
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int toreplace=nums.length-1;
        int current=0;
        int count=0;
        while (current<=toreplace){
            if (nums[current]==val){
                nums[current]=nums[toreplace];
                nums[toreplace]=0;
                toreplace--;
                count++;
            }else{
                current++;
            }
        }
        return (nums.length-count);
    }
}

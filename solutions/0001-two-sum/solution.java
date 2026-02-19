class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=nums.length-1;
        int i=0;
        int flag=1;
        int[] arr=new int[2];
        while (flag==1){
            if (i<j){
                if (nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }else{
                    j--;
                }
            }else{
                j=nums.length-1;
                i++;
            }
        }
        return arr;
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int[] arr=new int[60001];
        int num=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>=0){
                if (arr[nums[i]]==0){
                    arr[nums[i]]=1;
                    num+=nums[i];
                }else{
                    num-=nums[i];
                }
            }else{
                if (arr[30000-nums[i]]==0){
                    arr[30000-nums[i]]=1;
                    num+=nums[i];
                }else{
                    num-=nums[i];
                }
            }
        }
        return num;
    }
}

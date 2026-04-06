class Solution {
    public void nextPermutation(int[] nums) {
        int index=0;
        for (int i=(nums.length-1);i>0;i--){
            if (nums[i-1]<nums[i]){
                index=i;
                break;
            }
        }
        if (index==0){
            Arrays.sort(nums);
            return;
        }
        int i2=nums.length-1;
        int i=index;
        int cnt=0;
        while (cnt<(nums.length-index)/2 ){
            int temp=nums[i];
            nums[i]=nums[i2];
            nums[i2]=temp;
            i2--;
            cnt++;
            i++;
        }
        for (int j=index;j<nums.length;j++){
            if (nums[j]>nums[index-1]){
                 int tempo=nums[index-1];
                 nums[index-1]=nums[j];
                 nums[j]=tempo;
                 break;
            }
        } 
        return;
    }
}

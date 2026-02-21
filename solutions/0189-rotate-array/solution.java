class Solution {
    public void rotate(int[] nums, int k) {
        if (k%nums.length==0){
            return;
        }
        k=k%(nums.length);
        int[] temp=new int[k];
        int index=0;
        for (int i=nums.length-k;i<nums.length;i++){
            temp[index]=nums[i];
            index++;
        }
        for (int i=nums.length-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for (int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
    }
}

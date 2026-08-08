class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int maxlength=0;
        if (k==0){
            int length=0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]==1){
                    length++;
                }else{
                    maxlength=Math.max(length,maxlength);
                    length=0;
                }
            }
            maxlength=Math.max(maxlength,length);
        }
        while (start<=end && end<nums.length){
            if (nums[end]==0 && k>0){
                k--;
                end++;
            }else if (nums[end]==0 && k==0){
                if (nums[start]==0){
                    k++;
                }
                start++;
            }else{
                end++;
            }
            maxlength=Math.max(end-start,maxlength);
        }
        return maxlength;
    }
}

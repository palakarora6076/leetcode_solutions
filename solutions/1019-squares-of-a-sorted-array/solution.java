class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        int ptr1=0;
        int ptr2=n-1;
        n=n-1;
        while (ptr1<=ptr2){
            int sq1=nums[ptr1]*nums[ptr1];
            int sq2=nums[ptr2]*nums[ptr2];
            if (sq1>=sq2){
                result[n]=sq1;
                ptr1++;
            }else{
                result[n]=sq2;
                ptr2--;
            }
            n--;
        }
        return result;
    }
}

class Solution {
    public void nextPermutation(int[] nums) {
        List<Integer> sorted= new ArrayList<>();
        int index=0;
        for (int i=(nums.length-1);i>0;i--){
            sorted.add(nums[i]);
            if (nums[i-1]<nums[i]){
                index=i;
                break;
            }
        }
        if (index==0){
            Arrays.sort(nums);
            return;
        }
        sorted.sort(null);
        if (index!=0){
            int flag=0;
            int j=0;
            for (int i=index;i<nums.length;i++){
                int element=sorted.get(j);
                j++;
                if (element>nums[index-1] && flag==0){
                    int temp=nums[index-1];
                    nums[index-1]=element;
                    nums[i]=temp;
                    flag=1;
                }else{
                    nums[i]=element;
                }
            }
            return;
        }
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                int Valuej=nums[j];
                int Valuek=nums[k];
                int sum=nums[i]+nums[j]+nums[k];
                if (sum==0){
                    List<Integer> num=new ArrayList<>();
                    num.add(nums[i]);
                    num.add(nums[j]);
                    num.add(nums[k]);
                    result.add(num);
                    while (Valuej==nums[j]){
                        if (j<nums.length-1){
                            j++;
                        }else{
                            j=Integer.MAX_VALUE;
                            break;
                        }
                    }
                    while(Valuek==nums[k]){
                        if (k>=1){
                            k--;
                        }else{
                            k=Integer.MIN_VALUE;
                            break;
                        }
                    } 
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }
}

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result=0;
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (nums[i]==1){
                list.add(i);
            }
        }
        int ptr1=0;
        if (goal!=0 && list.size()<goal){
            return 0;
        }
        if (goal==0){
            int start=-1;
            for (int i=0; i<nums.length;i++){
                if (start==-1 && nums[i]==0){
                    start=i;
                }
                if (nums[i]==1 && start!=-1){
                    result+=((i-start)*(i-start+1))/2;
                    start=-1;
                }
            }
            if (start!=-1){
                result+=((nums.length-start)*(nums.length-start+1))/2;
            }
            return result;
        }
        while (ptr1<=list.size()-goal){
            int ptr2=ptr1+goal-1;
            int elementsbefore=0;
            int elementsafter=0;
            if (ptr1==0){
                elementsbefore=list.get(ptr1);                  
            }else{
                elementsbefore=list.get(ptr1)-list.get(ptr1-1)-1;
            }
            if (ptr2==list.size()-1){
                elementsafter=nums.length-1-list.get(ptr2);
            }else{
                elementsafter=list.get(ptr2+1)-list.get(ptr2)-1;
            }
            result+=(elementsbefore+elementsafter+(elementsbefore*elementsafter)+1);
            ptr1++;
        }
        return result;
    }
}

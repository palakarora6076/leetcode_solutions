class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        List<Integer> list= new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            if (nums[i]%2!=0){
                list.add(i);
            }
        }
        int ptr1=0;
        int answer=0;
        while (ptr1<=list.size()-k){
            int ptr2=ptr1+k-1;
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
            answer+=(elementsbefore+elementsafter+(elementsbefore*elementsafter)+1);
            ptr1++;
        }
        return answer;
    }
}

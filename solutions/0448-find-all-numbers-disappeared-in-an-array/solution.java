class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result= new ArrayList<>();
        int[] hash= new int[nums.length];
        int n=nums.length;
        for (int i=1;i<=n;i++){
            result.add(i);
        }
        for (int i=0;i<n;i++){
            result.set(nums[i]-1,0);
        }
        int index=0;
        for (int i=0;i<n;i++){
            if (result.get(i)!=0){
                result.set(index,result.get(i));
                index++;
            }
        }
        int ind=n-1;
        while (ind!=index-1){
            result.remove(ind);
            ind--;
        }
        return result;
    }
}

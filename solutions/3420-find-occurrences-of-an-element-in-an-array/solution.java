class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] result=new int[queries.length];
        List<Integer> hashed=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(nums[i]==x){
                hashed.add(i);
            }
        }
        for (int i=0;i<queries.length;i++){
            if (queries[i]<=hashed.size()){
                result[i]=hashed.get(queries[i]-1);
            }else{
                result[i]=-1;
            }
        }
        return result;
    }
}

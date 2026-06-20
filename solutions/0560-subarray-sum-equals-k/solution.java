class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hmap= new HashMap<>();
        hmap.put(0,1);
        int sum=0;
        int result=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            int diff=sum-k;
            if (hmap.containsKey(diff)){
                    result=result+hmap.get(diff);
            }
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }
        return result;
    }
}

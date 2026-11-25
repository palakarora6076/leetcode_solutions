class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            int el=nums[i];
            if (el<0) el=-el;
            if (nums[el-1]>0) nums[el-1]=-nums[el-1];
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0) result.add(i+1);
        }
        return result;
    }
}

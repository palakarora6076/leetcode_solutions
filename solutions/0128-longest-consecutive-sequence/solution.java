class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0 || nums.length==1) return nums.length;
        HashSet<Integer> hset=new HashSet<>();
        int longest=1;
        for (int i=0;i<nums.length;i++){
            hset.add(nums[i]);
        }
        for (int n:hset){
            if (!(hset.contains(n-1))){
                int cnt=1;
                while (hset.contains(n+cnt)){
                    cnt++;
                }
                longest=Math.max(cnt,longest);
            }
        }
        return longest;
    }
}

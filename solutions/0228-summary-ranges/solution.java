class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result=new ArrayList<>();
        if (nums.length==0){
            return result;
        }
        int start=nums[0];
        int end=nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]!=end+1){
                if(start!=end){
                    String s=start+"->"+end;
                    result.add(s);
                }else{
                    String s=start+"";
                    result.add(s);
                } 
                start=nums[i];
                end=nums[i];
            }else{
                end++;
            }
        }
        if(start!=end){
            String s=start+"->"+end;
            result.add(s);
        }else{
            String s=start+"";
            result.add(s);
        } 
        return result;
    }
}

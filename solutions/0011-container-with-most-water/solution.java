class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxvol=0;
        while(low<high){
            int vol=Math.min(height[low],height[high])*(high-low);
            if (maxvol<vol){
                maxvol=vol;
            }
            if (height[low]<=height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxvol;
    }
}

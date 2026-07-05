class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low=1;
        int high=candies[0];
        long total=0;
        for (int i=0;i<candies.length;i++){
            if (candies[i]>high){
                high=candies[i];
            }
            total+=candies[i];
        }
        if (total<k){
            return 0;
        }else if(total==k){
            return 1;
        }
        while (low<=high){
            int mid=low+(high-low)/2;
            long kids=0;
            for (int i=0;i<candies.length;i++){
                kids+=(candies[i]/mid);
            }
            if (kids<k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low-1;
    }
}

class Solution {
    public int bloom(int[] arr, int day, int adjacent){
        int counter=0;
        int total=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<=day){
                counter++;
                if(counter==adjacent){
                    total++;
                    counter=0;
                }
            }else{
                counter=0;
            }
        }
        return total;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if (n/k<m){
            return -1;
        }
        int high=0;
        for (int i=0;i<n;i++){
            if (bloomDay[i]>high){
                high=bloomDay[i];
            }
        }
        int low=1;
        while (low<=high){
            int mid=low+(high-low)/2;
            int bloomed=bloom(bloomDay,mid,k);
            if (bloomed<m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}

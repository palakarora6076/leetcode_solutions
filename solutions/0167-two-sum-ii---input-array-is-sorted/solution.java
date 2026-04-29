class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]= new int[2];
        for (int i=0;i<numbers.length;i++){
            int low=0;
            int high=numbers.length-1;
            int search=target-numbers[i];
            int index=-1;
            while ( low<=high && high<numbers.length){
                int mid=(low+high)/2;
                if (numbers[mid]==search && i!=mid){
                    index=mid;
                    break;
                }else if (numbers[mid]>search){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }
            if (index!=-1){
                arr[0] = i+1;
                arr[1] = index+1;
                return arr;
            }
        }
        return arr;
    }
}

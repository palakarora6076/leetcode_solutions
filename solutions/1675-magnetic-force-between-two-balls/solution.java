import java.util.Arrays;
class Solution {
    public int countballs(int[] array, int force){
        int balls=1;
        int ptr1=0;
        int ptr2=1;
        while(ptr2<array.length){
            if ((array[ptr2]-array[ptr1])>=force){
                balls++;
                ptr1=ptr2;
            }
            ptr2++;
        }
        return balls;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int high=position[position.length-1]-position[0];
        int low=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int balls= countballs(position, mid);
            if (balls<m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low-1;
    }
}

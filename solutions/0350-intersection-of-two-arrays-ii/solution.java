import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr=new int[1001];
        for (int i=0;i<nums1.length;i++){
            arr[nums1[i]]=arr[nums1[i]]+1;
        }
        List<Integer> result=new ArrayList<>();
        for (int i=0;i<nums2.length;i++){
            if (arr[nums2[i]]>0){
                result.add(nums2[i]);
                arr[nums2[i]]=arr[nums2[i]]-1;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

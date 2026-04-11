class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result= new ArrayList<>();
        int ind2[]= new int[1001];
        for (int i=0;i<nums2.length;i++){
            ind2[nums2[i]]=1;
        }
        for (int i=0;i<nums1.length;i++){
            if (ind2[nums1[i]]==1){
                result.add(nums1[i]);
                ind2[nums1[i]]=0;
            }
        }
        int arr[]=new int[result.size()];
        for (int j=0;j<arr.length;j++){
            arr[j]=result.get(j);
        }
        return arr;
    }
}

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> l1 = new HashSet<>();
        Set<Integer> l2 = new HashSet<>();
        int arr1[]=new int[2001];
        int arr2[]=new int[2001];
        for (int i=0;i<nums1.length;i++){
            if(nums1[i]>=0){
                arr1[nums1[i]]=1;
            }else{
                arr1[1000-nums1[i]]=1;
            }
        }
        for (int j=0;j<nums2.length;j++){
            if(nums2[j]>=0){
                arr2[nums2[j]]=1;
            }else{
                arr2[1000-nums2[j]]=1;
            }
        }
        for (int k=0;k<nums1.length;k++){
            if (nums1[k]>=0 && arr2[nums1[k]]==0){
                l1.add(nums1[k]);
            }else if(nums1[k]<0 && arr2[1000-nums1[k]]==0){
                l1.add(nums1[k]);
            }
        }
        for (int l=0;l<nums2.length;l++){
            if (nums2[l]>=0 && arr1[nums2[l]]==0){
                l2.add(nums2[l]);
            }else if(nums2[l]<0 && arr1[1000-nums2[l]]==0){
                l2.add(nums2[l]);
            }
        }
        List<Integer> li1=new ArrayList<>(l1);
        List<Integer> li2=new ArrayList<>(l2);
        ans.add(li1);
        ans.add(li2);
        return ans;
    }
}

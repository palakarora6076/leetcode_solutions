class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (Arrays.equals(target,arr)){
            return true;
        }
        int tar[]=new int[1000];
        int arr1[]=new int[1000];
        for (int i=0;i<target.length;i++){
            tar[target[i]-1]+=1;
        }
        for (int i=0;i<target.length;i++){
            arr1[arr[i]-1]+=1;
        }
        for (int i=0;i<target.length;i++){
            if (tar[target[i]-1]!=arr1[target[i]-1]){
                return false;
            }
        }
        return true;
    }
}

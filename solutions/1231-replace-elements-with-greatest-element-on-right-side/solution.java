class Solution {
    public int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        int[] result= new int[arr.length];
        for (int i=arr.length-2;i>-1;i--){
            max=Math.max(arr[i+1],max);
            result[i]=max;
        }
        result[arr.length-1]=-1;
        return result;
    }
}

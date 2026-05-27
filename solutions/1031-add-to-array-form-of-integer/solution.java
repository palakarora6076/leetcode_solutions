class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result=new ArrayList<>();
        int index=num.length-1;
        while (index>=0 || k>0){
            if (index>-1){
                int digit=k%10;
                if ((digit+num[index])<10){
                    result.add(digit+num[index]);
                    index--;
                    k=k/10;
                }else{
                    int sum=digit+num[index];
                    result.add(sum%10);
                    index--;
                    k=k/10;
                    k=k+1;
                }
            }else if(index<0 && k>0){
                result.add(k%10);
                k=k/10;
            }
        }
        Collections.reverse(result);
        return result;
    }
}

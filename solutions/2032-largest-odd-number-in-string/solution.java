class Solution {
    public String largestOddNumber(String num) {
        int index=-1;
        for (int i=0;i<num.length();i++){
            int digit=num.charAt(i);
            digit=digit-48;
            if  (digit%2!=0){
                index=i;
            }
        }
        if (index==-1){
            return "";
        }else{
            return num.substring(0,index+1);
        }
    }
}

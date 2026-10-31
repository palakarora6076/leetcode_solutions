class Solution {
    public boolean validPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        int count=0;
        boolean result=true;
        int tobedeleted=-1;
        while (low<high){
            char el1=s.charAt(low);
            char el2=s.charAt(high);
            if (el1==el2){
                low++;
                high--;
            }else{
                if (el1==s.charAt(high-1) && count==0){
                    tobedeleted=high;
                    high--;
                    count++;
                }else if(el2==s.charAt(low+1) && count==0){
                    tobedeleted=low;
                    low++;
                    count++;
                }else{
                    result=false;
                    break;
                }
            }
        }
        if (result==true) return true;
        if (count==0 && tobedeleted==-1) return false;
        if (tobedeleted<s.length()/2) return false;
        if(s.charAt(tobedeleted)==s.charAt(s.length()-tobedeleted)){
            low=s.length()-tobedeleted;
            high=tobedeleted;
            while (low<high){
                if (s.charAt(low)!=s.charAt(high)) return false;
                low++;
                high--;
            }
            return true;
        }else{
            return false;
        }
    }
}

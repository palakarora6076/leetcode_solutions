class Solution {
    public int numberOfSubstrings(String s) {
        int counter=0;
        boolean containsa=false;
        boolean containsb=false;
        boolean containsc=false;
        int counta=0;
        int countb=0;
        int countc=0;
        int start=0;
        int result=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a'){
                containsa=true;
                counta++;
            }else if(s.charAt(i)=='b'){
                containsb=true;
                countb++;
            }else{
                containsc=true;
                countc++;
            }
            if (containsa==true && containsb==true && containsc==true){
                result+=s.length()-i;
                if (s.charAt(start)=='a'){
                    counta--;
                }else if(s.charAt(start)=='b'){
                    countb--;
                }else{
                    countc--;
                }
                start++;
                while(counta!=0 && countb!=0 && countc!=0){
                    result+=s.length()-i;
                    if (s.charAt(start)=='a'){
                        counta--;
                    }else if(s.charAt(start)=='b'){
                        countb--;
                    }else{
                        countc--;
                    }
                    start++;
                }
                if (counta==0){
                    containsa=false;
                }else if(countb==0){
                    containsb=false;
                }else{
                    containsc=false;
                }
            }
        }
        return result;
    }
}

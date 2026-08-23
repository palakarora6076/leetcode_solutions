class Solution {
    public int characterReplacement(String s, int k) {
        int[] hmap= new int[26];
        int start=0;
        int maxf=0;
        int answer=0;
        for (int i=0;i<s.length();i++){
            int index=s.charAt(i);
            index-=65;
            hmap[index]=hmap[index]+1;
            maxf=Math.max(maxf,hmap[index]);
            int tobechanged=(i-start+1)-maxf;
            if (tobechanged>k){
                while ((i-start+1-maxf)>k){
                    int ind=s.charAt(start);
                    ind-=65;
                    hmap[ind]=hmap[ind]-1;
                    start++;
                    maxf=0;
                    for (int t=0;t<hmap.length;t++){
                        maxf=Math.max(maxf,hmap[t]);
                    }
                }
            }else{
                answer=Math.max(answer,i-start+1);
            }
        }
        return answer;
    }
}

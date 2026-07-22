class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int hashsetlength='z';
        hashsetlength++;
        int[] hashed = new int[hashsetlength];
        for (int i=0; i<t.length() ; i++){
            int letter=t.charAt(i);
            hashed[letter]=hashed[letter]+1;
        }
        for (int i=0 ; i<s.length(); i++){
            int letter=s.charAt(i);
            if (hashed[letter]==0){
                return false;
            }else{
                hashed[letter]=hashed[letter]-1;
            }
        }
        return true;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int maxlength=0;
        HashSet<Character> set= new HashSet<>();
        if (s.length()==0 || s.length()==1){
            return s.length();
        }
        for (int i=0;i<s.length();i++){
            char letter=s.charAt(i);
            if (set.contains(letter)){
                maxlength=Math.max(maxlength,i-start);
                while (set.contains(letter)){
                    set.remove(s.charAt(start));
                    start++;
                }
            }
            set.add(letter);
            if (i==s.length()-1){
                maxlength=Math.max(maxlength,i-start+1);
            }
            
        }
        return maxlength;
    }
}

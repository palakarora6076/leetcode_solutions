class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s= new StringBuilder();
        int index=0;
        int flag=0;
        while (flag==0){
            if (index==strs[0].length()){
                break;
            }
            char compare=strs[0].charAt(index);
            for (int i=1;i<strs.length;i++){
                if (index==strs[i].length()){
                    return s.toString();
                }else{
                    if (compare!=(strs[i].charAt(index))){
                        return s.toString();
                    }
                }
                                                
            }
            if (flag==0){
                s.append(compare);
            }
            index++;
        }
        return s.toString();
    }
}

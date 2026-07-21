class Solution {
    public String reverseWords(String s) {
        List<String> words= new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if (current==' ' && !(word.toString().equals(""))){
                words.add(word.toString());
                word.setLength(0);
                continue;
            }else if(current==' '){
                continue;
            }
            word.append(current);
        }
        words.add(word.toString());
        StringBuilder answer=new StringBuilder();
        for (int i=words.size()-1;i>-1;i--){
            if (!words.get(i).equals("")){
                if (i!=0){
                    answer.append(words.get(i));
                    answer.append(" ");
                }else{
                    answer.append(words.get(i));
                }
            }
        }
        return answer.toString();
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<tokens.length;i++){
            if (tokens[i].equals("+") || tokens[i].equals("-")  || tokens[i].equals("*")  || tokens[i].equals("/") ){
                int el1=st.pop();
                int el2=st.pop();
                int ans=0;
                if (tokens[i].equals("+")){
                    ans=el1+el2;
                }else if(tokens[i].equals("-") ){
                    ans=el2-el1;
                }else if(tokens[i].equals("*") ){
                    ans=el1*el2;
                }else{
                    ans=el2/el1;
                }
                st.push(ans);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}

import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> openingbrackets= new Stack<>();
        int n=s.length();
        for (int i=0;i<n;i++){
            char element=s.charAt(i);
            if (element=='{' || element=='[' || element=='('){
                openingbrackets.push(element);
            }else{
                if (openingbrackets.empty()) return false;
                if (element=='}' && openingbrackets.peek()!='{'){
                    return false;
                }else if (element==')' && openingbrackets.peek()!='('){
                    return false;
                }else if (element==']' && openingbrackets.peek()!='['){
                    return false;
                }
                openingbrackets.pop();
            }
        }
        if (openingbrackets.empty()) return true;
        return false;
    }
}

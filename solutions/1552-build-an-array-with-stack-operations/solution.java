import java.util.Stack;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer= new ArrayList<>();
        int index=0;
        for (int i=1; i<=n;i++){
            answer.add("Push");
            if (i==target[index] && index==target.length-1){
                break;
            }else if(i==target[index]){
                index++;
            }else{
                answer.add("Pop");
            }
        }   
        return answer;
    }
}

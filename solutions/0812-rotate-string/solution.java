class Solution {
    public boolean rotateString(String s, String goal) {
    String goal2=goal+goal;
    if (goal2.contains(s)){
        return true;
    }
    return false;
    }
}

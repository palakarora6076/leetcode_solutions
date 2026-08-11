class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int ptr1=0;
        int ptr2=n-k-1;
        int total=0;
        int currentsum=0;
        for (int i=0;i<n;i++){
            if (i<=ptr2){
                currentsum+=cardPoints[i];
            }
            total+=cardPoints[i];
        }
        int minsumofwindow=total;
        while (ptr2<n-1){
            minsumofwindow=Math.min(currentsum,minsumofwindow);
            currentsum=currentsum-cardPoints[ptr1];
            ptr1++;
            ptr2++;
            currentsum+=cardPoints[ptr2];
        }
        minsumofwindow=Math.min(currentsum,minsumofwindow);
        return (total-minsumofwindow);
    }
}

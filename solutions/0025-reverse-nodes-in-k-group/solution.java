/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k==1){
            return head;
        }
        int count=0;
        ListNode temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        int numrev=count/k;
        temp=head;
        ListNode prevtail=null;
        ListNode newhead=null;
        while (numrev!=0){
            ListNode nextptr=null;
            ListNode currentail=null;
            ListNode currenthead=null;
            for (int i=0;i<k;i++){
                ListNode temp1=temp.next;
                temp.next=nextptr;
                nextptr=temp;
                if (i==0){
                    currentail=nextptr;
                }
                temp=temp1;
            }
            if (prevtail==null){
                newhead=nextptr;
                currentail.next=temp;
                prevtail=currentail;
            }else{
                prevtail.next=nextptr;
                currentail.next=temp;
                prevtail=currentail;
            }
            numrev--;
        }
        return newhead;
    }
}

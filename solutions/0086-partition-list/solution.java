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
    public ListNode partition(ListNode head, int x) {
        ListNode head1=null;
        ListNode head2=null;
        ListNode temp1=null;
        ListNode temp2=null;
        if (head==null || head.next==null) return head;
        ListNode temp=head;
        while (temp!=null){
            ListNode tempo=temp.next;
            temp.next=null;
            if(temp.val<x){
                if (temp1==null){
                    head1=temp;
                    temp1=temp;
                }else{
                    temp1.next=temp;
                    temp1=temp1.next;
                }
            }else{
                if (temp2==null){
                    head2=temp;
                    temp2=temp;
                }else{
                    temp2.next=temp;
                    temp2=temp2.next;
                }
            }
            temp=tempo;
        }
        if (head1==null) return head2;
        if (head2==null) return head1;
        temp1.next=head2;
        return head1;
    }
}

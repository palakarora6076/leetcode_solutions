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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null) return head;
        if (head.next==null) return head;
        int count=0;
        ListNode temp=head;
        ListNode tail=null;
        while (temp!=null){
            count++;
            if (temp.next==null){
                tail=temp;
            }
            temp=temp.next;
        }
        temp=head;
        tail.next=head;
        ListNode newhead=null;
        for (int i=0; i<(count-(k%count)-1);i++){
            temp=temp.next;
        }
        newhead=temp.next;
        temp.next=null;
        return newhead;
    }
}

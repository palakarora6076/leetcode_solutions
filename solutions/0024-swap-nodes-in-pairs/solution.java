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
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode newhead=null;
        ListNode temp=head;
        ListNode prevnode=null;
        while (temp!=null && temp.next!=null){
            ListNode temporary=temp.next.next;
            if (prevnode==null){
                ListNode n=temp.next;
                temp.next=temporary;
                n.next=temp;
                prevnode=temp;
                newhead=n;
                temp=temporary;
                continue;
            }
            prevnode.next=temp.next;
            temp.next=temporary;
            prevnode.next.next=temp;
            prevnode=prevnode.next.next;
            temp=temporary;
        }
        return newhead;
    }
}

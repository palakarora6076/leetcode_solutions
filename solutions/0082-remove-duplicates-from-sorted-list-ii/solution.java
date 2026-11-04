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
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode previous=null;
        ListNode newhead=null;
        while (temp!=null){
            if (temp.next==null || temp.val!=temp.next.val){
                ListNode tempo=temp.next;
                if (previous==null){
                    temp.next=null;
                    newhead=temp;
                    previous=temp;
                }else{
                    temp.next=null;
                    previous.next=temp;
                    previous=previous.next;
                }
                temp=tempo;
            }else{
                int value=temp.val;
                while (temp!=null && temp.val==value){
                    temp=temp.next;
                }
            }
        }
        if (previous!=null) previous.next=null;
        return newhead;
    }
}

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
    private ListNode findmiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode lefthead, ListNode righthead){
        ListNode temp1=lefthead;
        ListNode temp2=righthead;
        ListNode temp=null;
        ListNode newhead=null;
        while (temp1!=null && temp2!=null){
            ListNode temporary1=temp1.next;
            ListNode temporary2=temp2.next;
            if (temp==null){
                if (temp1.val<=temp2.val){
                    newhead=temp1;
                    temp1=temporary1;
                }else{
                    newhead=temp2;
                    temp2=temporary2;
                }
                temp=newhead;
            }else{
                if (temp1.val<=temp2.val){
                    temp.next=temp1;
                    temp1=temporary1;
                }else{
                    temp.next=temp2;
                    temp2=temporary2;
                }
                temp=temp.next;
            }
        }
        if (temp1==null){
            temp.next=temp2;
        }else{
            temp.next=temp1;
        }
        return newhead;
    }
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode middle=findmiddle(head);
        ListNode lefthead=head;
        ListNode righthead=middle.next;
        middle.next=null;
        ListNode leftlisthead=sortList(lefthead);
        ListNode rightlisthead=sortList(righthead);
        ListNode finalhead=merge(leftlisthead,rightlisthead);
        return finalhead;
    }
}

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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }        
        ListNode nextptr=null;
        ListNode temp=slow;
        while (temp!=null){
            ListNode temp1=temp.next;
            temp.next=nextptr;
            nextptr=temp;
            temp=temp1;
        }
        ListNode newhead=nextptr;
        ListNode temp1=head;
        ListNode temp2=newhead;
        while (temp2!=null){
            if (temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}


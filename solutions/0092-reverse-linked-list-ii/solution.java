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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==right) return head;
        ListNode toconnectatstart=null;
        ListNode temp=head;
        for (int i=0;i<left-1;i++){
            if (i==left-2){
                toconnectatstart=temp;
            }
            temp=temp.next;
        }
        ListNode previousnode=null;
        ListNode lastelement=null;
        for (int i=left;i<=right;i++){
            ListNode temp1=temp.next;
            temp.next=previousnode;
            if (previousnode==null){
                lastelement=temp;
            }
            previousnode=temp;
            temp=temp1;
        }
        if (toconnectatstart==null){
            lastelement.next=temp;
            return previousnode;
        }
        toconnectatstart.next=previousnode;
        lastelement.next=temp;
        return head;
    }
}

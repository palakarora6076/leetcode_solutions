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
    public ListNode oddEvenList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode head2=head.next;
        ListNode oddcon=head;
        ListNode evencon=head.next;
        ListNode temp=head.next.next;
        int flag=1;
        while (temp!=null){
            if (flag==0){
                evencon.next=temp;
                evencon=evencon.next;
                flag=1;
            }else{
                oddcon.next=temp;
                oddcon=oddcon.next;
                flag=0;
            }
            temp=temp.next;
        }
        evencon.next=null;
        oddcon.next=head2;
        return head;
    }
}

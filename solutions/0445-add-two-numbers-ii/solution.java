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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=null;
        ListNode head2=null;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode nextptr1=null;
        ListNode nextptr2=null;
        int count1=0;
        int count2=0;
        while (temp1!=null){
            ListNode tempo=temp1.next;
            temp1.next=nextptr1;
            nextptr1=temp1;
            temp1=tempo;
            count1++;
        }
        while (temp2!=null){
            ListNode tempo=temp2.next;
            temp2.next=nextptr2;
            nextptr2=temp2;
            temp2=tempo;
            count2++;
        }
        head1=nextptr1;
        head2=nextptr2;
        ListNode t1=head1;
        ListNode t2=head2;
        int carry=0;
        ListNode newhead=null;
        if (count1>=count2){
            while (t1!=null){
                int val1;
                int val2;
                if (t1==null){
                    val1=0;
                }else{
                    val1=t1.val;
                }
                if (t2==null){
                    val2=0;
                }else{
                    val2=t2.val;
                }
                t1.val=(val1+val2+carry)%10;
                carry=(val1+val2+carry)/10;
                t1=t1.next;
                if (t2!=null) t2=t2.next;
                if (carry==0 && t2==null) break;
            }
            newhead=head1;
        }else{
            while (t2!=null){
                int val1;
                int val2;
                if (t1==null){
                    val1=0;
                }else{
                    val1=t1.val;
                }
                if (t2==null){
                    val2=0;
                }else{
                    val2=t2.val;
                }
                t2.val=(val1+val2+carry)%10;
                carry=(val1+val2+carry)/10;
                t2=t2.next;
                if (t1!=null) t1=t1.next;
                if (carry==0 && t1==null) break;
            }
            newhead=head2;
        }
        ListNode temp=newhead;
        ListNode nextptr=null;
        while (temp!=null){
            ListNode temporary=temp.next;
            temp.next=nextptr;
            nextptr=temp;
            temp=temporary;
        }
        if (carry==1){
            ListNode finalhead= new ListNode();
            finalhead.val=1;
            finalhead.next=nextptr;
            return finalhead;
        }
        return nextptr;  
    }
}

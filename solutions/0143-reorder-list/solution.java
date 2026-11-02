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
    public void reorderList(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while (temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        if (st.size()==0 || st.size()==1 || st.size()==2) return;
        int s=st.size();
        temp=head.next;
        head.next=st.peek();
        ListNode prevptr=st.peek();
        st.pop();
        st.peek().next=null;
        while (st.size()!=(s+1)/2){
            ListNode tempo=temp.next;
            ListNode x=st.pop();
            st.peek().next=null;
            temp.next=x;
            prevptr.next=temp;
            prevptr=x;
            temp=tempo;
        }
        if (s%2!=0){
            prevptr.next=st.peek();
        }
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> elements= new HashSet<>();
        ListNode temp=head;
        while (temp!=null){
            elements.add(temp);
            ListNode n=temp.next;
            if (elements.contains(n)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int countA=0;
        int countB=0;
        while (tempA!=null || tempB!=null){
            if (tempA==tempB){
                return tempA;
            }
            if (tempA!=null){
                countA++;
                tempA=tempA.next;
            }
            if (tempB!=null){
                countB++;
                tempB=tempB.next;
            }
        }
        tempA=headA;
        tempB=headB;
        if (countA>countB){
            for (int i=0;i<(countA-countB);i++){
                tempA=tempA.next;
            }
        }else{
            for (int i=0;i<(countB-countA);i++){
                tempB=tempB.next;
            }
        }
        while (tempA!=null && tempB!=null){
            if (tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
}

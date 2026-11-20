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
       ListNode twoStep = head;
       ListNode oneStep = head;
       while(twoStep != null && twoStep.next != null){
        twoStep = twoStep.next.next;
        oneStep = oneStep.next;
        if(twoStep == oneStep){
            return true;
        }
       }
       return false;  
    }
}
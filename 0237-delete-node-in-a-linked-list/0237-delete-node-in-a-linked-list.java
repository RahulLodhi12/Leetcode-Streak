/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //shifting the node values only and change the next pointer address.
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//Delete Node in a Linked List
/*
Approach:
We can not delete the given node as we have not the access of the previous node.
We can change the value of Kth node to the value of (k+1)th node and change the next pointer of Kth node to point to whatever the (K+1)th node was pointing to.
*/
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}
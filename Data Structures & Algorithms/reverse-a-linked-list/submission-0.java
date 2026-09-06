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
    public ListNode reverseList(ListNode og) {
        if (og == null) return null;
        ListNode last = new ListNode(og.val, null);
        og = og.next;

        while (og != null) {
            ListNode curr = new ListNode(og.val, last);
            last = curr;
            og = og.next;
        }

        return last;
    }
}

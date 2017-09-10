

/**
 * @author yuriitsap.
 * https://leetcode.com/problems/add-two-numbers/description/
 */

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode startNode = new ListNode(0);
	ListNode firstIterativeNode = l1,
		secondIterativeNode = l2,
		currentIterativeNode = startNode;
	int carry = 0;
	while (firstIterativeNode != null || secondIterativeNode != null) {
	    int value = (firstIterativeNode == null ? 0
		    : firstIterativeNode.val) + (secondIterativeNode == null ? 0
		    : secondIterativeNode.val) + carry;
	    currentIterativeNode.next = new ListNode((value % 10));
	    currentIterativeNode = currentIterativeNode.next;
	    carry = 0 + (value / 10);
	    if (firstIterativeNode != null) {
		firstIterativeNode = firstIterativeNode.next;
	    }
	    if (secondIterativeNode != null) {
		secondIterativeNode = secondIterativeNode.next;
	    }
	}
	if (carry > 0) {
	    currentIterativeNode.next = new ListNode(carry);
	}
	return startNode.next;
    }
}

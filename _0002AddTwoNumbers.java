/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">Add two numbers</a>
 */
public class _0002AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solution = new ListNode(-1);
        ListNode current = solution;

        int retention = 0;
        ListNode item1 = l1;
        ListNode item2 = l2;
        while(item1 != null || item2 != null) {
            int sum = 0;
            if(item1 != null) {
                sum += item1.val;
                item1 = item1.next;
            }
            if(item2 != null) {
                sum += item2.val;
                item2 = item2.next;
            }
            sum += retention;

            retention = sum / 10;
            sum %= 10;

            current = append(current, sum);
        }
        if(retention > 0) append(current, retention);
        return solution;
    }

    private ListNode append(ListNode current, int sum) {
        if(current.val == -1) {
            current.val = sum;
            return current;
        }
        current.next = new ListNode(sum);
        return current.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

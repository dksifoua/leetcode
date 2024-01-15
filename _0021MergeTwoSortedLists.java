class _0021MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode list = new ListNode(Integer.MIN_VALUE);
        ListNode current = list;

        ListNode current1 = list1, current2 = list2;
        while (current1 != null || current2 != null) {
            if (current1 != null && current2 != null) {
                if (current1.val < current2.val) {
                    current = appendToList(current, current1.val);
                    current1 = current1.next;
                } else {
                    current = appendToList(current, current2.val);
                    current2 = current2.next;
                }
                continue;
            }

            if (current1 == null) {
                current = appendToList(current, current2.val);
                current2 = current2.next;
                continue;
            }

            if (current2 == null) {
                current = appendToList(current, current1.val);
                current1 = current1.next;
                continue;
            }
        }

        return list;
    }

    public static ListNode appendToList(ListNode current, int val) {
        if (current.val == Integer.MIN_VALUE) {
            current.val = val;
            return current;
        }

        current.next = new ListNode(val);
        return current.next;
    }
}
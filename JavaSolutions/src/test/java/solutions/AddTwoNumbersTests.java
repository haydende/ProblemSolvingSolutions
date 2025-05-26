package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.context.ListNode;

public class AddTwoNumbersTests {

    @Test
    public void firstTest() {
        // 342
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // 465
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        // 807
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);

        Assertions.assertTrue(compareNodes(expected, actual));
    }

    @Test
    public void secondTest() {
        // 9
        ListNode l1 = new ListNode(9);
        // 9999999991
        ListNode l2 =
            new ListNode(1,
                new ListNode(9,
                    new ListNode(9,
                        new ListNode(9,
                            new ListNode(9,
                                new ListNode(9,
                                    new ListNode(9,
                                        new ListNode(9,
                                            new ListNode(9,
                                                new ListNode(9))))))))));

        ListNode actual = AddTwoNumbers.addTwoNumbers(l1, l2);
    }

    boolean compareNodes(ListNode expected, ListNode actual) {
        int level = 0;
        ListNode currentExpNode = expected;
        ListNode currentActNode = actual;
        while (currentExpNode.next != null) {
            int expVal = currentExpNode.val;
            int actVal = currentActNode.val;
            Assertions.assertEquals(
                    expVal,
                    actVal,
                    String.format("Node values do not match at level %d! Expected: %d, Actual: %d", level, expVal, actVal)
            );
            level++;
            currentExpNode = currentExpNode.next;
            currentActNode = currentActNode.next;
        }
        return true;
    }

}

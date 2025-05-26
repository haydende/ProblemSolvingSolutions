package solutions;

import solutions.context.ListNode;

import java.math.BigInteger;

// https://leetcode.com/problems/add-two-numbers/description/
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger l1Val = extractListNode(l1);
        BigInteger l2Val = extractListNode(l2);

        BigInteger l3Val = l1Val.add(l2Val);

        return convertToListNode(l3Val);
    }

    private static BigInteger extractListNode(ListNode start) {
        StringBuilder digits = new StringBuilder(100);
        digits.append(start.val);
        ListNode currentNode = start;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            digits.append(currentNode.val);
        }
        return new BigInteger(digits.reverse().toString());
    }

    private static ListNode convertToListNode(BigInteger val) {
        char[] digitsArr = val.toString().toCharArray();
        ListNode end = new ListNode(Character.getNumericValue(digitsArr[digitsArr.length - 1]));
        ListNode currentNode = end;
        for (int i = digitsArr.length - 2; i > -1; i--) {
            ListNode newNode = new ListNode(Character.getNumericValue(digitsArr[i]));
            currentNode.next = newNode;
            currentNode = newNode;
        }
        return end;
    }

}


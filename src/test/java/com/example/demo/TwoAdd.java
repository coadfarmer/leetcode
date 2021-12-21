package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xjjiang
 * @Data: 2021/12/21 16:11
 * @Description:
 */
public class TwoAdd {

    @Test
    public void test() {
        ListNode l1 = new ListNode(3, new ListNode(3, new ListNode(4, null)));
        ListNode l2 = new ListNode(7, new ListNode(6, new ListNode(5, new ListNode(3))));
        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if(l1 != null)
            l1 = l1.next;
            if(l2 != null)
            l2 = l2.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

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
}

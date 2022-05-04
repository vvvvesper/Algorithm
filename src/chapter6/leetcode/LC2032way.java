package chapter6.leetcode;

import java.util.Arrays;

public class LC2032way {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;

        ListNode prev = dummyhead;
        while (prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return dummyhead.next;
    }

    public static void main(String[] args) {
        LC2032way lc2032way = new LC2032way();
        int[] data = {1,2,6,3,4,5,6};
        ListNode head = new ListNode(data);
        System.out.println(head);

        ListNode res = lc2032way.removeElements(head,6);
        System.out.println(res);
    }
}

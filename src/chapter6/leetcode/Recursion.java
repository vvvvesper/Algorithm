package chapter6.leetcode;

import org.w3c.dom.NodeList;

public class Recursion {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return null;
        }
//        ListNode res = removeElements(head.next,val);
//        if(head.val == val){
//            return res;
//        }else{
//            head.next = res;
//            return head;
//        }
        head.next = removeElements(head.next,val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,5,6};
        ListNode head = new ListNode(data);
        System.out.println(new Recursion().removeElements(head,6));
    }
}

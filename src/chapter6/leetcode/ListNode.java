package chapter6.leetcode;


  //Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }

      public ListNode(int[] arr){
          this.val = arr[0];
          ListNode cur = this;
          for(int i=1;i<arr.length;i++){
              cur.next = new ListNode(arr[i]);
              cur = cur.next;
          }
      }

      @Override
      public String toString(){
          StringBuilder res = new StringBuilder();
          ListNode cur = this;
          while(cur != null){
              res.append(cur.val + "->");
              cur = cur.next;
          }
          res.append("NULL");
          return res.toString();
      }
 }

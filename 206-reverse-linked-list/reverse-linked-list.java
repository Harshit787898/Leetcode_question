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
    public ListNode reverseList(ListNode head) {
         ListNode res=null;
         ListNode fo=head;
         while(head!=null){
           fo=head.next;
           if(res==null){
              res=head;
              head.next=null;
           }
           else{
               head.next=res;
               res=head;
           }
           head=fo;
          }
        return res;
    }
}
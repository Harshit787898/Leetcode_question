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
    public ListNode removeNodes(ListNode head) {
        ListNode head2=reverse(head);
        ListNode temp=new ListNode(-1);
        ListNode tail=temp;
        int max=Integer.MIN_VALUE;
        while(head2!=null){
            max=Math.max(max,head2.val);
            if(head2.val==max){
                tail.next=head2;
                tail=head2;
            }
            head2=head2.next;
        }
        tail.next=null;
        return reverse(temp.next);
    }
    public ListNode reverse(ListNode head) {
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
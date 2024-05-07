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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            int dou=temp.val*2+c;
            temp.val=dou%10;
            c=dou/10;
            if(temp.next==null && c>0){
                temp.next=new ListNode(c);
                break;
            }
            temp=temp.next;
        }
        return reverse(head);
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
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
    public int length(ListNode head){
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=length(head);
        if(head==null || head.next==null || k<=1)
        return head;
        ListNode oh=null,ot=null;
        while(len>=k ){
            ListNode th=null,tt=null;
            for(int i=0;i<k;i++){
                ListNode fo=head.next;
                if(th==null){
                    th=head;
                    tt=head;
                    head.next=null;
                }
                else{
                    head.next=th;
                    th=head;
                }
                head=fo;
            }
            len-=k;
            if(oh==null){
                oh=th;
                ot=tt;
            }
            else{
                
                ot.next=th;
                ot=tt;
            }
        }
        if(ot!=null && head!=null)
        ot.next=head;
        return oh;
    }
}
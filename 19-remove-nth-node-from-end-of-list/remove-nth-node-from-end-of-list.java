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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        return null;
        int l=0;
        ListNode temp=head;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int no=l-n-1;
        if(no<0){
            head=head.next;
            return head;
        }
        ListNode rem=head;
        while(rem.next!=null&&no!=0){
            rem=rem.next;
            no--;
        }
        if(rem.next!=null)
        rem.next=rem.next.next;
        return head;
    }
}
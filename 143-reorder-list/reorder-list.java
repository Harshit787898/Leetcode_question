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
    public ListNode reverse(ListNode head){
        if(head==null)
        return null;
        ListNode prev=null;
        ListNode curr=head;
        ListNode nex=null;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
    public void merge(ListNode l1,ListNode l2){
        while(l2!=null){
            ListNode temp=l1.next;
            l1.next=l2;
            l1=l2;
            l2=temp;
        }
    }
    public void reorderList(ListNode head) {
        if(head==null ||head.next==null){
            return ;
        }
        ListNode slow=head,fast=head,prev=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next=null;
        ListNode l1=head;
        ListNode l2=reverse(slow);
        merge(l1,l2);
    }
}
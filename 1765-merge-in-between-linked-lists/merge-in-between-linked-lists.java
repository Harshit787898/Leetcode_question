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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1start=list1;
        int startcount=0;
        ListNode l1end=list2;
        int endcount=0;
        while(startcount!=a-1){
            l1start=l1start.next;
            startcount++;
        }
        ListNode t=l1start;
        while(endcount!=b-a+1){
            t=t.next;
            endcount++;
        }
        l1start.next=list2;
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t.next;
        return list1;
    }
}
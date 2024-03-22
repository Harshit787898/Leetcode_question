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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        int arr[]=new int[l];
        temp=head;
        int i=0;
        while(temp!=null){
            if(i<l)
            arr[i++]=temp.val;
            temp=temp.next;
        }
        int low=0;
        int h=l-1;
        while(low<h){
            if(arr[low]!=arr[h])
            return false;
            low++;
            h--;
        }
        return true;
    }
}
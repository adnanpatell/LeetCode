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
    ListNode mergedList, head, t1, t2;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        t1 = list1;
        t2 = list2;
        
        if (t1 != null && t2 == null) return t1;      
        if (t1 == null && t2 != null) return t2;

        while(t1 != null && t2 != null) {
            if (t1.val < t2.val) advance1();
            else if (t1.val > t2.val) advance2();
            else { advance1(); advance2(); }
        }
        
        if (t1 != null) mergedList.next = t1;
        if (t2 != null) mergedList.next = t2;
        
        return head;
    }
    
    private void advance1(){
        if (mergedList == null) {
            mergedList = new ListNode(t1.val);
            head = mergedList;
        } else {
            mergedList.next = new ListNode(t1.val);
            mergedList = mergedList.next;
        }
        t1 = t1.next;
    }
    private void advance2(){
        if (mergedList == null) {
            mergedList = new ListNode(t2.val);
            head = mergedList;
        } else {
            mergedList.next = new ListNode(t2.val);
            mergedList = mergedList.next;    
        }
        t2 = t2.next;
    }
}
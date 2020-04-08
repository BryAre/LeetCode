/**
 * Problem: 876. Middle of the Linked List
 * 
 * Definition for singly-linked list.
 * 
 * public class ListNode { int val; ListNode next; ListNode(int x) { val = x; }
 * }
 */

class Day8 {
    public ListNode middleNode(ListNode head) {
        ListNode middle = new ListNode(); // make a middle pointer that points to head. For use later
        middle = head;
        int length = 0; // make a counter to count the number of elements in the list

        // iterate through all the elements of the linked list and get the length with
        // counter
        while (head != null) {
            length += 1;
            head = head.next;
        }

        // iterate till the middle of the linked list now that we have the length.
        for (int i = 0; i < (length / 2); i++) {
            System.out.print(middle.val);
            middle = middle.next;
        }

        // return the middle node of the linked list
        return middle;
    }
}
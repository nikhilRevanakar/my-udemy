package com.learning.linkedlist.qa;

public class AddTwoNumbers {

//	You are given two non-empty linked lists representing two non-negative integers. 
//	The digits are stored in reverse order, and each of their nodes contains a single digit. 
//	Add the two numbers and return the sum as a linked list.
//
//	You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	
//	Example 1:
//		2  ->  4  ->  3
//		5  ->  6  ->  4
//	op: 7  ->  0  ->  8
//	
//	Input: l1 = [2,4,3], l2 = [5,6,4]
//	Output: [7,0,8]
//	Explanation: 342 + 465 = 807.

//	Example 2:
//
//		Input: l1 = [0], l2 = [0]
//		Output: [0]
//	Example 3:
//
//		Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//		Output: [8,9,9,9,0,0,0,1]
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode n3 = new ListNode(3, null);
		ListNode n2 = new ListNode(4, n3);
		ListNode n1 = new ListNode(2, n2);
		
		ListNode m3 = new ListNode(4, null);
		ListNode m2 = new ListNode(6, m3);
		ListNode m1 = new ListNode(5, m2);
		
		
		ListNode res=addTwoNumbers(n1, m1);
		while(res != null) {
			System.out.print(res.val);
			if(res.next!=null) {
				System.out.print(" -> ");
			}
			res = res.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode oneHead = l1;
        ListNode twoHead = l2;
        
        ListNode head = null;
        ListNode tail = null;
        
        int carry = 0;
        while(oneHead !=null || twoHead !=null || carry !=0) {
            int iVal = oneHead !=null ? oneHead.val : 0;
            int jVal = twoHead !=null ? twoHead.val : 0;
            
            int sum = iVal + jVal + carry;
            int val = sum%10;
            carry = sum/10;
           
            if(head==null) {
                ListNode nw = new ListNode(val, null);
                head = nw;
                tail = nw;
            } else{
                ListNode nw = new ListNode(val, null);
                tail.next=nw;
                tail=nw;
            }
            oneHead = oneHead.next;
            twoHead = twoHead.next;
        }
        return head;
    }

}

 
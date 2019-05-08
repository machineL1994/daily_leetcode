package MiddleoftheLinkedList;

import java.util.Scanner;

class MyListNode{
    int val;
    MyListNode next;
    MyListNode(int val){
        this.val = val;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    /**
     * the idea is two pointer one fast pointer one slow pointer, and fast step two while slow step one
     * @param head
     * @return
     */
    public static MyListNode middleNode(MyListNode head){
        MyListNode slow = head, fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

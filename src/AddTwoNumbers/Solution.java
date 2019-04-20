package AddTwoNumbers;

class MyListNode {
    int val;
    MyListNode next;
    MyListNode(int val){
        this.val = val;
    }
}
public class Solution {
    public static void main(String[] args) {
        MyListNode l1 = new MyListNode(2);
        l1.next = new MyListNode(4);
        l1.next.next = new MyListNode(3);
        MyListNode l2 = new MyListNode(5);
        l2.next = new MyListNode(6);
        l2.next.next = new MyListNode(4);
        MyListNode res = addTwoNumber(l1, l2);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static MyListNode addTwoNumber(MyListNode l1, MyListNode l2){
        int bit_sum = 0;
        MyListNode res = new MyListNode(0);
        MyListNode loop = res;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            if(l1 != null){
                bit_sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                bit_sum += l2.val;
                l2 = l2.next;
            }
            loop.next = new MyListNode((bit_sum+carry)%10);
            carry = (bit_sum+carry) / 10;
            bit_sum = 0;
            loop = loop.next;
        }
        return res.next;
    }
}

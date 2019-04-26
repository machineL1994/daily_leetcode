package IncreasingOrderSearchTree;


import java.util.ArrayList;
import java.util.List;

class MyTreeNode{
    int val;
    MyTreeNode left, right;
    MyTreeNode(int val){
        this.val = val;
    }

}
public class Solution {
    static List<MyTreeNode> tmp_res = new ArrayList<>();
    public static void main(String[] args) {
        MyTreeNode root = new MyTreeNode(5);
        MyTreeNode node1 = new MyTreeNode(3);
        MyTreeNode node2 = new MyTreeNode(6);
        MyTreeNode node3 = new MyTreeNode(2);
        MyTreeNode node4 = new MyTreeNode(4);
        MyTreeNode node5 = new MyTreeNode(8);
        MyTreeNode node6 = new MyTreeNode(1);
        MyTreeNode node7 = new MyTreeNode(7);
        MyTreeNode node8 = new MyTreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        node3.left = node6;
        node5.left = node7;
        node5.right = node8;
        inorder(root);
        MyTreeNode res = increasingBST(root);
    }
    public static List<MyTreeNode> inorder(MyTreeNode root){
        if(root != null){
            increasingBST(root.left);
            tmp_res.add(root);
            increasingBST(root.right);
        }
        return tmp_res;
    }
    public static MyTreeNode increasingBST(MyTreeNode root){
        MyTreeNode res_root = tmp_res.get(0);
        MyTreeNode forward_node = tmp_res.get(0);
        for (MyTreeNode e_treeNode: tmp_res) {
            forward_node.right = e_treeNode;
            forward_node = e_treeNode;
        }
        return res_root.right;
    }
}

package UnivaluedBinaryTree;

class MyTreeNode{
    int val;
    MyTreeNode left, right;
    public MyTreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public static void main(String[] args) {
        MyTreeNode root = new MyTreeNode(2);
        MyTreeNode node1 = new MyTreeNode(2);
        MyTreeNode node2 = new MyTreeNode(2);
        MyTreeNode node3 = new MyTreeNode(5);
        MyTreeNode node4 = new MyTreeNode(2);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        System.out.println(isUnivalTree(root));

    }

    public static boolean isUnivalTree(MyTreeNode root){
        if(root != null){
            if((root.left!=null && root.left.val != root.val) || (root.right!=null && root.right.val != root.val))
                return false;
            boolean left_correct = isUnivalTree(root.left);
            boolean right_correct = isUnivalTree(root.right);
            return left_correct && right_correct;
        }
        return true;
    }
}

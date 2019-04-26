package N_aryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

class MyNode{
    public int val;
    public List<MyNode> children;

    public MyNode(){}

    public MyNode(int val, List<MyNode> children) {
        this.val = val;
        this.children = children;
    }
}

public class Solution {
    public static List<Integer> res = new ArrayList<>();
    public static void main(String[] args) {

    }

    public static List<Integer> preorder(MyNode root){
        if(root != null){
            res.add(root.val);
            for (MyNode node : root.children) {
                preorder(node);
            }
        }
        return res;
    }
}

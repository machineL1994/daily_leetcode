package Leaf_SimilarTrees;

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

    public static void main(String[] args) {

    }

    public boolean leafSimilar(MyTreeNode root1, MyTreeNode root2){
        List<Integer> vals_1 = new ArrayList<>();
        List<Integer> vals_2 = new ArrayList<>();
        leafs(root1, vals_1);
        leafs(root2, vals_2);
        if(vals_1.size() != vals_2.size())
            return false;
        else{
            for (int i = 0; i < vals_1.size() ; i++) {
                if(vals_1.get(i) != vals_2.get(i))
                    return false;
            }
            return true;
        }
    }
    public void leafs(MyTreeNode root, List<Integer> vals){
        if(root == null) return;
        if(root.left == null && root.right == null){
            vals.add(root.val);
        }else{
            leafs(root.left, vals);
            leafs(root.right, vals);
        }
    }
}

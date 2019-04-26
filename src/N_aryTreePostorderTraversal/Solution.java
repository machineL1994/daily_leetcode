//package N_aryTreePostorderTraversal;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//class MyNode{
//    public int val;
//    public List<MyNode> children;
//
//    public Node(){}
//
//    public MyNode(int val, List<MyNode> children) {
//        this.val = val;
//        this.children = children;
//    }
//}
//public class Solution {
//    List<Integer> myres = new ArrayList<>();
//    public static void main(String[] args) {
//
//    }
//
//    public List<Integer> postOrder(MyNode root){
//
//        if(root!=null){
//            for (MyNode node: root.children) {
//                postOrder(node);
//            }
//            myres.add(root.val);
//        }
//        return myres;
//    }
//
//
//}

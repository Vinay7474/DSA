package Trees;

public class Symmetric_Tree {
//     Given the root of a binary tree, check whether it is symmetric, i.e., whether the tree is a mirror image of itself.


// A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.

// Examples:

// Input: root[] = [1, 2, 2, 3, 4, 4, 3]
//    ex-1_1
// Output: True
// Explanation: As the left and right half of the above tree is mirror image, tree is symmetric.
// Input: root[] = [1, 2, 2, N, 3, N, 3]
//    ex-2_1
// Output: False
// Explanation:  As the left and right half of the above tree is not the mirror image, tree is not symmetric. 
// Constraints:
// 1  ≤ number of nodes ≤ 2000
// solution:----------------------------using recursion---------------------------------------------------
 public boolean isSymmetric(Node node) {
        // Code here
         if(node==null){
            return true;
        }
        return check(node.left, node.right);
    }
     public static boolean check(Node n1, Node n2){
        if(n1==null&&n2==null){
            return true;
        }
        if( n1==null||n2==null){
            return false;
        }
        if(n1.data!=n2.data){
            return false;
        }
        return check(n1.left, n2.right)&&check(n1.right,n2.left);
    }
}

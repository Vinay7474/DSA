package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Identical_Trees {
    // Given two binary trees with their root nodes r1 and r2, return true if both of them are identical, otherwise, false.

// Examples:

// Input:
//     1          1
//    /   \       /   \
//   2     3    2    3
// Output: true
// Explanation: 
// There are two trees both having 3 nodes and 2 edges, both trees are identical having the root as 1, left child of 1 is 2 and right child of 1 is 3.
// Input:
//     1         1
//    /   \      /  \
//   2     3   3   2
// Output: false
// Explanation: There are two trees both having 3 nodes and 2 edges, but both trees are not identical.
// Input:
//     1   1
//    /      \
//   2        2
// Output: false
// Explanation: Although both trees have the same node values (1 and 2), they are arranged differently, making the trees non-identical.
// Constraints:
// 1 <= number of nodes <= 105
// 1 <= node->data <= 109
// solution:--------------------------------------------------------------------------------- using level ordering-------------------
boolean isIdentical(Node r1, Node r2) {
        // Code Here
        if(r1==null&&r2==null){
            return true;
        }
        if(r1==null||r2==null){
            return false;
        }
        Queue<Node>q1=new LinkedList<>();
        Queue<Node>q2=new LinkedList<>();
        q1.add(r1);
        q2.add(r2);
        
        
        while(!q1.isEmpty()||!q2.isEmpty()){
            Node c1=q1.poll();
            Node c2=q2.poll();
            if(c1.data!=c2.data){
                return false;
            }
            if(c1.left!=null&&c2.left!=null){
                q1.add(c1.left);
                q2.add(c2.left);
            }
            else if((c1.left!=null&&c2.left==null)||(c1.left==null&&c2.left!=null)){
                return false;
            }
            if(c1.right!=null&&c2.right!=null){
                q1.add(c1.right);
                q2.add(c2.right);
            }
            else if((c1.right!=null&&c2.right==null)||(c1.right==null&&c2.right!=null)){
                return false;
            }
        
        }
        return true;
        
    }
}

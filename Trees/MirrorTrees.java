package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTrees {
//     Given a Two Binary Trees, write a function that returns true if one is mirror of other, else returns false.
// MirrorTree1            

// Examples:

// Input:
// a:      1     b:      1
//       /   \         /   \
//      2     3       3     2
// Output: true
// Explanation: Given pairs of binary tree are mirror of each other.

// Input:
// a:      10      b:    10
//        /  \          /  \
//       20  30        20  30
//      /  \          /  \
//     40   60       40  60
// Output: false
// Explanation: Given pairs of binary tree are not mirror of each other.
// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(h).

// Constraints:
// 1 <= number of nodes<= 105
// 0 <= node -> data<= 105 
// solution:-----------------------------using level ordering----------------------------------------------
boolean areMirror(Node r1, Node r2) {
        // Your code here
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
            if(c1.left!=null&&c2.right!=null){
                q1.add(c1.left);
                q2.add(c2.right);
                
            }
            else if((c1.left!=null&&c2.right==null)||(c1.left==null&&c2.right!=null)){
                return false;
            }
            if(c1.right!=null&&c2.left!=null){
                q1.add(c1.right);
                q2.add(c2.left);
                
            }
            else if((c1.right!=null&&c2.left==null)||(c1.right==null&&c2.left!=null)){
                return false;
            }
        
        }
        return true;
    }

}

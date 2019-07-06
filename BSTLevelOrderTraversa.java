import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BSTLevelOrderTraversa {

static void levelOrder(Node root){
      if(root == null) return;

      Queue<Node> queue = new LinkedList<Node>();
      queue.add(root);

      bfs(root, queue);
      
    }

static void bfs(Node node, Queue<Node> qu) {
        while(!qu.isEmpty()) {
          Node curr = qu.poll();
          System.out.print(curr.data + " ");
          if(curr.left!=null) qu.add(curr.left);
          if(curr.right!=null) qu.add(curr.right);
        }

        if(qu.isEmpty()) return;
}

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

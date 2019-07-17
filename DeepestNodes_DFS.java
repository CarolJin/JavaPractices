import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class DeepestNodes_DFS {
	int deepLevel;
	List<Integer> results;
	HashMap<Integer, List<Integer>> hm = new HashMap<>();

	public static void main(String args[]) {
		Node1 root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(3);
		root.left.left = new Node1(4);
		root.left.right = new Node1(5);
		root.right.left = new Node1(6);
		root.right.right = new Node1(7);
		root.right.right.right = new Node1(8);
		root.right.right.left = new Node1(9);

		DeepestNodes_DFS dp = new DeepestNodes_DFS();		
		System.out.println("Deepest childs are: " + dp.Deep(root,0));

	}


	private List<Integer> Deep(Node1 root, int depth) {
		if(root == null) return null;
		
		int maxDepth = 0;
		
		Stack<Data> st = new Stack<Data>(); //Initial a stack with object [node, depth]
		
		Data dt = new Data(root, depth);
		st.push(dt);
		while(!st.isEmpty()) {			
			Data currentNode = st.pop();
		//	System.out.println("Current node depth is " + currentNode.depth + ", the value is "+currentNode.node.val);
			
			if(hm.containsKey(currentNode.depth)) {
				results = hm.get(currentNode.depth);
			} else { 
				results = new ArrayList<Integer>();
				}
			results.add(currentNode.node.val);
			hm.put(currentNode.depth, results);
			
			if(currentNode.node.left!=null) {
				Data left = new Data(currentNode.node.left, currentNode.depth+1);
				st.push(left);
			}
			if(currentNode.node.right!=null) {
				Data right = new Data(currentNode.node.right, currentNode.depth+1);
				st.push(right);
			}
			
			if(currentNode.depth >maxDepth) maxDepth = currentNode.depth; //record the largest depth for HM lookup later
			
		}
		
//		int len = hm.keySet().toArray().length;
//		Object[] keyArr = hm.keySet().toArray();
//		int max = (int) keyArr[0];
//		for(int i=1; i<len; i++) {
//			if((int)keyArr[i]>max) max = (int)keyArr[i];
//		}
		
		return hm.get(maxDepth);
	}
	
}

class Node1 {
	int val;
	Node1 left, right;
	
	public Node1(int val) {
		this.val = val;
		left = null;
		right = null;
	}
}

class Data {
	Node1 node;
	int depth;
	
	public Data(Node1 node, int depth) {
		this.node=node;
		this.depth=depth;
	}
}

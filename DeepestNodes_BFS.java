import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class DeepestNodes_BFS {
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

		DeepestNodes_BFS dp = new DeepestNodes_BFS();		
		System.out.println("Deepest childs are: " + dp.Breath(root,0));

	}


	private List<Integer> Breath(Node1 root, int depth) {
		if(root == null) return null;
		
		int maxDepth = 0;
		
		Queue<Data> queue = new LinkedList<Data>(); //Initial a stack with object [node, depth]
		
		Data dt = new Data(root, depth);
		queue.offer(dt);
		while(!queue.isEmpty()) {			
			Data currentNode = queue.poll();
			System.out.println("Current node depth is " + currentNode.depth + ", the value is "+currentNode.node.val);
			
			if(hm.containsKey(currentNode.depth)) {
				results = hm.get(currentNode.depth);
			} else { 
				results = new ArrayList<Integer>();
				}
			results.add(currentNode.node.val);
			hm.put(currentNode.depth, results);
			
			if(currentNode.node.left!=null) {
				Data left = new Data(currentNode.node.left, currentNode.depth+1);
				queue.offer(left);
			}
			if(currentNode.node.right!=null) {
				Data right = new Data(currentNode.node.right, currentNode.depth+1);
				queue.offer(right);
			}
			
			if(currentNode.depth >maxDepth) maxDepth = currentNode.depth; //record the largest depth for HM lookup later
			
		}
		
		return hm.get(maxDepth);
	}
	
}

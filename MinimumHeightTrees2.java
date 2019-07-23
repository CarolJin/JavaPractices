/*For an undirected graph with tree characteristics, we can choose any node as the root. The result graph is then a rooted tree. Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs). Given such a graph, write a function to find all the MHTs and return a list of their root labels.

Format
The graph contains n nodes which are labeled from 0 to n - 1. You will be given the number n and a list of undirected edges (each edge is a pair of labels).

You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
e.g. Input: n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]

     0  1  2
      \ | /
        3
        |
        4
        |
        5 

Output: [3, 4]
*/

class MinimumHeightTrees2 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        if(n == 0) return new ArrayList<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(n == 1) {
            ans.add(0);
            return ans;
        }
        
        int[] kids  = new int[n]; //To store count - how many kid-nodes each node will have.
        
        ////To initiate the graph with edges - nodes & its kids(non-directed graph, so add node as kid to each other)
        Set<Integer>[] graph = new Set[n]; 
        for(int i = 0; i < n; i++) {
            graph[i] = new HashSet<Integer>();
        }
        
        for(int[] edge : edges) {
            int n1 = edge[0];
            int n2 = edge[1];
            
            kids[n1]++;
            kids[n2]++;
            
            graph[n1].add(n2);
            graph[n2].add(n1);
        }
        
        //Put the node into the queue, while the node has kid count equals to 1
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(kids[i] == 1) {
                q.offer(i);
                kids[i]--;
            }
        }
        
        while(!q.isEmpty()) {
            //clear the output arraylist till the final
            ans.clear();
            
            //Get the queue size & loop the entire level of tree, then move on the the next level. Otherwise you don't know where you're.
            int size = q.size();
            for(int i = 0; i < size; i++) {
               int currNode = q.poll();
                ans.add(currNode);
                kids[currNode]--;
                
                for(int childNode : graph[currNode]) {
                    kids[childNode]--;
                    if(kids[childNode] == 1) {
                        q.offer(childNode);
                    }
                } 
            }
            
        }
        
        return ans;

	}
    
}

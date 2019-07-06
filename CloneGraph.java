class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        
        Node newNode = new Node(node.val);
        newNode.neighbors = new ArrayList<>();
        
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(node);
        
        HashMap<Node, Node> hm = new HashMap<>();
        hm.put(node, newNode);
        
        while(!qu.isEmpty()) {
            Node oldNode = qu.poll();
            
            for(Node n : oldNode.neighbors) {
                Node newNeighbor = null;              
                if(!hm.containsKey(n)) {
                    newNeighbor = new Node(n.val);
                    hm.put(n, newNeighbor);
                    newNeighbor.neighbors = new ArrayList<>();
                    qu.add(n);                    
                } 
                else {
                    newNeighbor = hm.get(n); 
                }  
                                
                hm.get(oldNode).neighbors.add(newNeighbor);
            }
        }
        
        return newNode;
             
    }
    
}

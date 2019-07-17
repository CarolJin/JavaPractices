package bfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class CourseSchedule {
	public static void main(String[] args) {
		CourseSchedule cs = new CourseSchedule();
		int n = 4;
		int[][] prerequisites = {{1,0},{2,0},{2,1},{3,2}};
		
		if (cs.canFinish(n, prerequisites))
			System.out.println("True");
		else
			System.out.println("false");
	}
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		if (prerequisites.length == 0)
			return true;

		if (numCourses < 1)
			return false;

		Graph graph = new Graph(numCourses);

		for (int i = 0; i < prerequisites.length; i++) {
			graph.addEdge(prerequisites[i][1], prerequisites[i][0]);
		}

		if (graph.isCyclic())
			return false;

		return true;
	}

}

class Graph {
	private int V;
	private LinkedList<Integer> adj[];

	public Graph(int V) {
		this.V = V;
		adj = new LinkedList[V];

		for (int i = 0; i < V; i++)
			adj[i] = new LinkedList<>();
	}

	public void addEdge(int u, int v) {
		adj[u].add(v);
	}

	public boolean isCyclic() {
		boolean[] visited = new boolean[V];
		boolean[] recStack = new boolean[V];

		for (int i = 0; i < V; i++)
			if (isCyclicUtil(i, visited, recStack))
				return true;

		return false;
	}

	private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {

		if (recStack[i])
			return true;

		if (visited[i])
			return false;

		visited[i] = true;
		recStack[i] = true;
		List<Integer> children = adj[i];

		for (Integer c : children)
			if (isCyclicUtil(c, visited, recStack))
				return true;

		recStack[i] = false;

		return false;
	}
}
//Runtime: 2 ms
//Memory Usage: 43.6 MB


//solution 2:
```
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;
        
        if(numCourses<1)
            return false;
        
        List<Integer>[] graph = new List[numCourses]; 
        for(int i=0; i<numCourses; i++) {
           graph[i] = new ArrayList<Integer>();
        }
        
        for(int i =0; i<prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        
        int[] visited = new int[numCourses];
      /*  for(int i=0; i<numCourses; i++) {
            visited[i] = 0;
        } */
        
        for(int i=0; i<numCourses; i++) {
           if(hasCycle(graph, visited, i))
               return false;
        }
        
        return true;        
    }
    
    private boolean hasCycle(List<Integer>[] graph, int[] visited, int course) {
        
        visited[course] = 1;
        
        for(int depend : graph[course]) {
            if(visited[depend] == 1) 
                return true;
            else if(visited[depend] == 0) {
                if(hasCycle(graph, visited, depend))
                    return true;
            }
        }
        
        visited[course] = 2;
        return false;
        
    }
    
}
```

// The 2nd solution,
// Runtime: 2 ms
// Memory Usage: 44.7 MB

class CourseSchedule2 {
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
    //    for(int i=0; i<numCourses; i++) {
    //        visited[i] = 0;
    //    }
        
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
        
        visited[course] = Integer.MAX_VALUE;
        return false;
        
    }
    
}

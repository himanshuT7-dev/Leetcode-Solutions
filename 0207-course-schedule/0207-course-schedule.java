class Solution {
    private boolean dfs(int course, List<List<Integer>> graph,boolean[] visited, boolean[] path) {
        if(path[course])
            return false;

        if(visited[course])
            return true;

        path[course] = true;
        visited[course] = true;

        for(int neighbour : graph.get(course))
        {
            if (!dfs(neighbour, graph, visited, path))
                return false;
        }

        path[course] = false;

        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < numCourses; i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++)
        {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        boolean visited[] = new boolean[numCourses];
        boolean path[] = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) 
        {
            if(!visited[i]) 
            {
                if(!dfs(i,graph,visited,path))
                    return false;
            }
        }
        return true;
    }
}
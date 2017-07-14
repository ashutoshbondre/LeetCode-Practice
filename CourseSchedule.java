public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int matrix [] [] = new int [numCourses][numCourses];
        int indegree[] = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++)
        {
            int ready = prerequisites[i][0];
            int prereq= prerequisites[i][1];
            if(matrix[prereq][ready]==0)
            {
                indegree[ready]++;
            }
            matrix[prereq][ready]=1;
        }
        
        int count = 0;
        Queue<Integer> q =new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0) q.offer(i);
        }
        while(!q.isEmpty())
        {
            count++;
            int course = q.poll();
            for(int i=0;i<numCourses;i++)
            {
                if(matrix[course][i]!=0)
                    if(--indegree[i]==0) q.offer(i);
            }
        }
        return count==numCourses;
    }
}
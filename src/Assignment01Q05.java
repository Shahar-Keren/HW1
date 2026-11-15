public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {    
        if (i == j)
            return 0;        
        
        boolean[] visited = new boolean[m.length];
        visited[i] = true;
        int[] curr = new int[m.length];
        int[] next = new int[m.length];
        int steps = 0;
        int nextCounter = 0;

        for(int k = 0; k < m.length; k++){
            curr[k] = -1;
            next[k] = -1;
        }
            
        curr[0] = i;
 
        while (steps <= m.length) {
            steps += 1;
            for (int k = 0; k < m.length; k++){
                for (int n = 0; n < m.length; n++){
                    if(curr[k] != -1 && m[curr[k]][n] == 1){
                        if (n == j) 
                            return steps;               
                        if (visited[n] == false) {
                            next[n] = n;
                            visited[n] = true;
                            nextCounter += 1;
                        }
                    }
                
                }
            }
            if (nextCounter == 0) 
                return -1;
            nextCounter = 0;
            for(int k = 0; k < m.length; k++){
                curr[k] = next[k];
                next[k] = -1; 
            }
                    
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
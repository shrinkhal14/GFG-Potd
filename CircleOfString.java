
class Solution {
    private static final int CHAR = 26; 
    private void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }

    
    private boolean isStronglyConnected(ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>> reverseAdj, int[] outDegree) {
        boolean[] visited = new boolean[CHAR];
        int startNode = -1;

       
        for (int i = 0; i < CHAR; i++) {
            if (outDegree[i] > 0) {
                startNode = i;
                break;
            }
        }

     
        if (startNode == -1) return true; 

        dfs(startNode, visited, adj);

        
        for (int i = 0; i < CHAR; i++) {
            if (outDegree[i] > 0 && !visited[i]) {
                return false;
            }
        }

        
        Arrays.fill(visited, false);
        dfs(startNode, visited, reverseAdj);

        
        for (int i = 0; i < CHAR; i++) {
            if (outDegree[i] > 0 && !visited[i]) {
                return false;
            }
        }

        return true;
    }

    
    public int isCircle(String[] arr) {
        int[] inDegree = new int[CHAR];
        int[] outDegree = new int[CHAR];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(CHAR);
        ArrayList<ArrayList<Integer>> reverseAdj = new ArrayList<>(CHAR);

        
        for (int i = 0; i < CHAR; i++) {
            adj.add(new ArrayList<>());
            reverseAdj.add(new ArrayList<>());
        }

     
        for (String str : arr) {
            int firstChar = str.charAt(0) - 'a';
            int lastChar = str.charAt(str.length() - 1) - 'a';
            adj.get(firstChar).add(lastChar);
            reverseAdj.get(lastChar).add(firstChar);
            outDegree[firstChar]++;
            inDegree[lastChar]++;
        }

        
        for (int i = 0; i < CHAR; i++) {
            if (inDegree[i] != outDegree[i]) {
                return 0;
            }
        }

        
        if (!isStronglyConnected(adj, reverseAdj, outDegree)) {
            return 0;
        }

        return 1;
    }

    
}

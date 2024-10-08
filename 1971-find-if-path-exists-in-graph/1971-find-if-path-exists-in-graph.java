class Solution {
   public boolean validPath(int n, int[][] edges, int source, int destination) {
        Graph g = new Graph(edges, n);
        g.visit(source, destination);
        return g.isVisited(destination);
    }
    
    class Graph {
        
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visited;
        
        public Graph(int[][] edges, int n) {
            
			// initialize the graph with all possible nodes
            for(int i = 0; i < n; i++) {
                map.put(i, new ArrayList<Integer>());
            }
            
			// Insert edges into graph. Make sure both source and destination are placed in the map 
			// since this is an undirected graph with cycles possible
            for(int i = 0; i < edges.length; i++) {
                List<Integer> list = map.get(edges[i][0]);
                list.add(edges[i][1]);
                map.put(edges[i][0], list);
                
                list = map.get(edges[i][1]);
                list.add(edges[i][0]);
                map.put(edges[i][1], list);
            }
             
            visited = new boolean[map.size()];
        }
        
        public void visit(int source, int destination) {
            List<Integer> dests = map.get(source);
            visited[source] = true;
            
            for(int i = 0; i < dests.size(); i++) {
                int next = dests.get(i);
                if(!visited[next]) {
                    visit(next, destination);
                }
            }
        }
        
        public boolean isVisited(int destination) {
            return visited[destination];
        }
    }
}
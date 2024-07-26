class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        int costMatrix[][] = new int[n][n];
        //Initialize Cost Matrix
        for(int i = 0 ; i < n; i++) {
           Arrays.fill(costMatrix[i], Integer.MAX_VALUE/2);
        }

        //Fill Cost Matrix with Edge weights
        for(int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            int wt = edge[2];
            costMatrix[x][y] = wt;
            costMatrix[y][x] = wt;
        }

        // Apply Floyd-Warshall Algorithm
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == j) {
                        costMatrix[i][j] = 0;
                    }
                    costMatrix[i][j] = Math.min(costMatrix[i][k] + costMatrix[j][k], costMatrix[i][j]);
                }
            }
        }
        int ans[] = new int[n];
        Arrays.fill(ans, 0);

        ///Count Reachable Cities 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(costMatrix[i][j] <= distanceThreshold && i != j) {
                    ans[i]++;
                }
            }
        }
        
        //Determine the Result City
        int resultCity = -1;
        int min = n;
        for(int i = 0; i < n; i++) {
            if(ans[i] < min) {
                min = ans[i];
                resultCity = i;
            }
            else if(ans[i] == min) {
                resultCity = resultCity > i ? resultCity : i ;
            }
        }

        return resultCity;
    }
}
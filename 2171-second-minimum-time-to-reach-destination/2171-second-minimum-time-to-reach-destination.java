class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] d1 = new int[n + 1];
        int[] d2 = new int[n + 1];
        Arrays.fill(d1, Integer.MAX_VALUE);
        Arrays.fill(d2, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 1});
        d1[1] = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int timePassed = curr[0];
            int node = curr[1];

            if (d2[n] != Integer.MAX_VALUE && node == n) { // We reached n 2nd time means it's the second minimum
                return d2[n];
            }

            int mult = timePassed / change;
            if (mult % 2 == 1) { // Red light
                timePassed = change * (mult + 1); // to set green
            }

            for (int nbr : adj.get(node)) {
                if (d1[nbr] > timePassed + time) { // +time for this edge to reach nbr
                    d2[nbr] = d1[nbr];
                    d1[nbr] = timePassed + time;
                    pq.offer(new int[]{timePassed + time, nbr});
                } else if (d2[nbr] > timePassed + time && d1[nbr] != timePassed + time) {
                    d2[nbr] = timePassed + time;
                    pq.offer(new int[]{timePassed + time, nbr});
                }
            }
        }
        return -1; 
    }
}
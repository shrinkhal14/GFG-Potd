class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
     
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for (long rope : arr) {
            minHeap.add(rope);
        }

        long totalCost = 0;

        while (minHeap.size() > 1) {
            long first = minHeap.poll();
            long second = minHeap.poll();

            long cost = first + second;
            totalCost += cost;

            minHeap.add(cost);
        }

        return totalCost;
    }


}

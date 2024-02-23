public static List<Double> runningMedian(List<Integer> a) {
    List<Double> medians = new ArrayList<>();

        // Max heap for the lower half of the elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Min heap for the upper half of the elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : a) {
            addNumber(num, maxHeap, minHeap);
            rebalanceHeaps(maxHeap, minHeap);
            double median = calculateMedian(maxHeap, minHeap);
            medians.add(median);
        }
        return medians;
    }
    
    private static void addNumber(int num, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
    }

    private static void rebalanceHeaps(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        while (Math.abs(maxHeap.size() - minHeap.size()) > 1) {
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.poll());
            } else {
                maxHeap.add(minHeap.poll());
            }
        }
    }

    private static double calculateMedian(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.size() > minHeap.size() ? maxHeap.peek() : minHeap.peek();
        }
    }

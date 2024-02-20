public static int cookies(int k, List<Integer> A) {
        int operations = 0;
        
        //convert list to priorityQueue for similar functionality
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(A);
        
        while(priorityQueue.size() > 1 && priorityQueue.peek() < k){
            int leastSweet = priorityQueue.poll();
            int secondLeastSweet = priorityQueue.poll();
            int newCookie = leastSweet + 2 * secondLeastSweet;
            priorityQueue.add(newCookie);
            operations++;
        }
        return (priorityQueue.peek() >= k) ? operations : -1;
    }

public static void miniMaxSum(List<Integer> arr) {
        
        //calculate the sum of all elements
        long sum = arr.stream().mapToLong(Integer::intValue).sum();
        
        //calculate the min and max possible sums
        long minSum = sum - arr.stream().max(Integer::compare).get();
        long maxSum = sum - arr.stream().min(Integer::compare).get();
        
        System.out.println(minSum + " " + maxSum);
    }

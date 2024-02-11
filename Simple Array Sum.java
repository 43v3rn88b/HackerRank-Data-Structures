public static int simpleArraySum(List<Integer> ar) {
        //using loop
        // int sum = 0;
        // for(int element : ar){
        //     sum += element;
        // }
        // return sum;
        
        //using stream
        return ar.stream().mapToInt(Integer::intValue).sum();
    }

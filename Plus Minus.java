public static void plusMinus(List<Integer> arr) {
        //get the size of list
        int n = arr.size();
        
        //initialize the counters
        int positive = 0;
        int negative= 0;
        int zero = 0;
        
        //read the list elements and count the positive, negative and zero elements
        for(int i=0; i<n; i++){
            
            int e = arr.get(i);
            if(e>0){
                positive++;
            }
            else if(e<0){
                negative++;
            }
            else{
                zero++;
            }
        }
        
        //calculate ratios
        double positiveRatio = (double) positive/n;
        double negativeRatio = (double) negative/n;
        double zeroRatio = (double) zero/n;
        
        //print ratios in 6 decimal places
        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
        
    }

public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();// use the size of the provided matrix
        
        //calculate the sum of two diagonals
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        for (int i = 0; i < n; i++) {
            firstDiagonal += arr.get(i).get(i);
            secondDiagonal += arr.get(i).get(n - 1 - i);
        }
        //calculate the absolute difference
        int sum = Math.abs(firstDiagonal - secondDiagonal);
        return sum;
        
    }

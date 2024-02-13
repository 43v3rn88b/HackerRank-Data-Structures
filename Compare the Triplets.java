public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        
        for(int i=0; i<a.size(); i++){
            if(a.get(i) > b.get(i)){
                aliceScore++;
            }else if(a.get(i)<b.get(i)){
                bobScore++;
            }
            //if the values are equal, no one gets a point
        }
        List<Integer> result = new ArrayList<>();
        result.add(aliceScore);
        result.add(bobScore);
        return result;
    }

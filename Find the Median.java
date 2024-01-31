public static int findMedian(List<Integer> arr) {
        
        Collections.sort(arr); //sort list
        int meridian = arr.size()/2; //calculate the index of meridian
        return arr.get(meridian); //return index value

    }

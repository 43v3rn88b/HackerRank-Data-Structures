public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int size = arr.size();
        // handle cases where rotations are > than array size
        int rotate = d % size;
        Collections.reverse(arr.subList(0,rotate));
        // reverse the sublist from 0 to rotations-1
        Collections.reverse(arr.subList(rotate, size));
        // reverse the entire list
        Collections.reverse(arr);
        return arr;
    }

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter query number: ");
        int query = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0; i<query; i++){
            int type = sc.nextInt();
            switch (type){
                case 1:
                //insert element to the heap
                int value = sc.nextInt();
                minHeap.add(value);
                break;
                case 2:
                //delete element from the heap
                int deleteValue = sc.nextInt();
                minHeap.remove(deleteValue);
                break;
                case 3:
                //print minimum element in the heap
                System.out.println(minHeap.peek());
                break;
                default:
                System.out.println("Invalid query");
            }
        }
    }

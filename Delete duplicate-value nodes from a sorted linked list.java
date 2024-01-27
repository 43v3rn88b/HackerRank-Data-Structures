 public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        if(llist == null || llist.next == null){
            return llist; // no duplicates to remove
        } 
        SinglyLinkedListNode current = llist;
        while(current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next; // remove duplicate node
            }else{
                current = current.next; // move to the next node
            }
        }
            return llist;
    }

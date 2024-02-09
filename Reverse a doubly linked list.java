public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        DoublyLinkedListNode temp = null;
        DoublyLinkedListNode current = llist;
        
        //swap next and prev for all nodes of doubly linkedlist
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        //before changing head, check for the cases like empty list and list with only one node
        if(temp != null){
            llist = temp.prev;
        }
        return llist;
    }

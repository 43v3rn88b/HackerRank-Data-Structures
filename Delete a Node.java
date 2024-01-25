public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    if(llist == null){ // The list is empty
        return null;
    }
    if(position == 0){ // special case: delete head
        return llist.next;
    }
    SinglyLinkedListNode current = llist;
    int currentPosition = 1;
    while(current != null && currentPosition < position){
        current = current.next;
        currentPosition++;
    }
    if(current == null || current.next == null){ // the position is beyond the length of linked list
        return llist;
    }
    current.next = current.next.next; // adjust pointerss to skip the node to be deleted
    return llist;
    
    }
}

public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    if(llist == null || positionFromTail < 0){
        throw new IllegalArgumentException("invalid arguments");
    }
    
    SinglyLinkedListNode slow = llist;
    SinglyLinkedListNode fast = llist;
    
    // Move the fast pointer to the positionFromTail
    for(int i=0; i<=positionFromTail; i++){
        if(fast == null){
            throw new IllegalArgumentException("out of bounds");
        }
        fast = fast.next;
    }
    
    // Move both pointers until the fast pointer reaches the end
    while(fast != null){
        slow = slow.next;
        fast = fast.next;
    }    
    return slow.data;
}

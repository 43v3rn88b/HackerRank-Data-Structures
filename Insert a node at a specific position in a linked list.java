public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    if(position ==1){
         newNode.next = llist;
       
        return newNode;
    }
    SinglyLinkedListNode current = llist;
    int currentPosition = 1;
    while(current != null && currentPosition< position ){
        current = current.next;
        currentPosition++;
    }
    if(current == null){
        return llist;
    }
        
    newNode.next = current.next;
    current.next = newNode;
    
    return llist;
}

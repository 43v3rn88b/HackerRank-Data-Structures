static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(llist == null){ //if the linkedlist is empty, set the newNode as both head and tail
            llist = newNode;
             
        }else{
            // if not, update head and connect the newNode
            newNode.next = llist;
            llist = newNode;
        }
        return llist;
    }

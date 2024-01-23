static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        //if the linkedlist is empty, set the new node as the head
        if(head == null){
            head = node;
            return head;
        }else{
            //traverse to end of list and add new node
            SinglyLinkedListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
        return head; // return modified linkedlist
    }

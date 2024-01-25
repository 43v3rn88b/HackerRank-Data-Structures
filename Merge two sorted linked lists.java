static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode mergeHead = new SinglyLinkedListNode(0);// dummy node to simplify code
        SinglyLinkedListNode current = mergeHead;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                current.next = head1;
                head1 = head1.next;
            }else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if(head1 != null){ // if one of the lists is not empty, append the remaining nodes
            current.next = head1;
        }else{
            current.next = head2;
        }
        return mergeHead.next; // skip the dummy node and return the actual head of the merged list
    }

static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while(head1 != null && head2 != null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        // check if both lists are at the end, meaning they have the same length
        return(head1 == null && head2 == null)? true: false;
    }

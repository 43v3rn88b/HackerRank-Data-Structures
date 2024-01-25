public static void reversePrint(SinglyLinkedListNode llist) {
        if(llist == null){ // if empty
            return;
        }
        reversePrint(llist.next); // using recursion
        System.out.println(llist.data);
    }

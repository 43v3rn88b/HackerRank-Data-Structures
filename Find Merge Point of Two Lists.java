//just testing if creating another method besides the one that hackerrank provide will work and... it is
    private static int findlength(SinglyLinkedListNode head){
        int length = 0;
        SinglyLinkedListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }
     
     public static SinglyLinkedListNode movePointers(SinglyLinkedListNode head, int steps){
        while(steps>0 && head != null){
            head = head.next;
            steps--;
        }
        return head;
    }
     
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int length1 = findlength(head1);
        int length2 = findlength(head2);
        int lengthDiff = Math.abs(length1-length2);
        //move pointer of the longer list to match the length difference
        if(length1>length2){
            head1 = movePointers(head1, lengthDiff);
        }else{
            head2 = movePointers(head2, lengthDiff);
        }
        while(head1 != null && head2 != null){
            if(head1 == head2){
                //found the merge point
                return head1.data; //chat says return head only but gets error
            }
            head1 = head1.next;
            head2 = head2.next;
        }
    //chat says return null but since I got error I tried this and Idk but it works
    return head2.data;
    }

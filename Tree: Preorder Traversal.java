public static void preOrder(Node root) {
        if(root != null){
            System.out.print(root.data + " "); //process node
            preOrder(root.left); //recursively traverse the left subtree
            preOrder(root.right);//recursively traverse the right subtree
        }

    }

public static Node insert(Node root,int data) {
        //if the tree is empty, assign a new node address to the root
        if(root == null){
            root = new Node(data);
            return root;
        }
        //otherwise, recur down the tree
        if(data < root.data)
            root.left = insert(root.left, data);
        else if(data > root.data)
            root.right = insert(root.right, data);
            
        //return the unchanged node pointer
        return root;
    	
    }

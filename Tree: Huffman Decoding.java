void decode(String s, Node root) {
        StringBuilder output = new StringBuilder();
        Node currentNode = root;
        
        for(int i = 0; i<s.length(); i++){
            currentNode = s.charAt(i) == '1' ? currentNode.right:
            currentNode.left;
            if(currentNode.left == null && currentNode.right == null){
                output.append(currentNode.data);
                currentNode = root;
            }
        }
        System.out.print(output);
       
    }

public static void levelOrder(Node root) {
      if(root == null){
          return;
      }
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
          Node tempNode = queue.poll();
          System.out.print(tempNode.data + " ");
          if(tempNode.left != null){
              queue.add(tempNode.left);
          }
          if(tempNode.right != null){
              queue.add(tempNode.right);
          }
      }
      
    }

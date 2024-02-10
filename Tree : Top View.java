 Node root;
    static class QueueObj{
        Node node;
        int hd;
        QueueObj(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
	public static void topView(Node root) {
      if(root == null){
          return;
      }
      Queue<QueueObj> queue = new LinkedList<>();
      Map<Integer, Node> tMap = new TreeMap<>();
      queue.add(new QueueObj(root, 0));
      while(!queue.isEmpty()){
          QueueObj tNode = queue.poll();
          if(!tMap.containsKey(tNode.hd)){
              tMap.put(tNode.hd, tNode.node);
          }
          if(tNode.node.left != null){
              queue.add(new QueueObj(tNode.node.left, tNode.hd - 1));
          }
          if(tNode.node.right != null){
              queue.add(new QueueObj(tNode.node.right, tNode.hd+ 1));
          }
      }
      for(Map.Entry<Integer, Node> entry : tMap.entrySet()){
          System.out.print(entry.getValue().data + " ");
      }
    }

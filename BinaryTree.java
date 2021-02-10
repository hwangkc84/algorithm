class BinaryTree{
    Node rootNode =null;

    public void insertNode(int element){
        if(rootNode ==null){
            rootNode = new Node(element);
        }else{
            Node head = rootNode;
            Node currentNode;

            while(true){
                
                currentNode = head;

                if(head.value > element){
                    head = head.leftChild;
                    if(head == null){
                        currentNode.leftChild = new Node(element);
                        break;
                    }

                }else{
                    head = head.rightChild;
                    if(head ==null){
                        currentNode.rightChild = new Node(element);
                        break;
                    }

                }

            }
        }
    }
}
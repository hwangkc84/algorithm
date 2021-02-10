public class SimpleLinkedList {
    
    private Node header;
    private int size;

    public SimpleLinkedList(){
        header = new Node(null);
        size = 0;
    }

    private class Node{

        private Object data;
        private Node nextNode;

        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }
    }

    public void addFirst(Object data){
        Node newNode = new Node(data);
        newNode.nextNode = header.nextNode;
        header.nextNode = newNode;
        size++;
    }

    public Object removeFirst(){
        Node firstNode = getNode(0);
        header.nextNode = firstNode.nextNode;
        size--;
        return firstNode.data;
    }

    private Node getNode(int index){
        if(index<0 || index >= size){
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }

        Node node = header.nextNode;
        for(int i=0; i<index; i++){
            node = node.nextNode;
        }

        return node;
    }

}

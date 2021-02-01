package sample;

public class SimpleLinkedList<T> {
    Node head;

    class Node<T> {
        T data;
        Node next;

        Node(T s){
            data = s;
            next = null;
        }
    }
    public SimpleLinkedList insertNode(SimpleLinkedList list, Node node){
        node.next = null;


        if(list.head == null){
            list.head = node;
        } else {
            Node lastNode = list.head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }

        return list;
    }

//    public static SimpleLinkedList deleteSong(SimpleLinkedList list, Song song){
//    //TODO add delete functinality
//
//
//    }

    
    
    
    //TODO: add functionality to print out Song title, not just song data
    public void printList(SimpleLinkedList list){
        Node currentNode = list.head;
        System.out.println("List: ");

        while(currentNode !=null){
            System.out.print(currentNode.data+ " ");

            currentNode = currentNode.next;
        }
    }


}

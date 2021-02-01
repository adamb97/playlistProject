package sample;

public class SimpleLinkedList<T> {
    Node head;
    static class Node {
        Song data;
        Node next;

        Node(Song s){
            data = s;
            next = null;
        }
    }
    public SimpleLinkedList insertSong(SimpleLinkedList list, Song song){
        Node newNode = new Node(song);
        newNode.next = null;


        if(list.head == null){
            list.head = newNode;
        } else {
            Node lastNode = list.head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        return list;
    }

//    public static SimpleLinkedList deleteSong(SimpleLinkedList list, Song song){
//    //TODO add delete functinality
//
//
//    }

    public void printList(SimpleLinkedList list){
        Node currentNode = list.head;
        System.out.println("List: ");

        while(currentNode !=null){
            System.out.print(currentNode.data.getTitle() + " ");

            currentNode = currentNode.next;
        }
    }


}

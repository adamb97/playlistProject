package sample;

public class Playlist extends SimpleLinkedList {

    public void addSong(Song s){
       Node newNode = new Node(s);
       this.insertNode(this, newNode);
    }

    public void printPlaylist(){
        this.printList(this);
    }
}

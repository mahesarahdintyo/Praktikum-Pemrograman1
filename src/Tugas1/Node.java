package Tugas1;

public class Node {
    private int nilai;
    private Node next;

    //inisialisasi Node dengan nilai
    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null; //atau bisa diisi dengan nilai default lainnya
    }

    //getter untuk nilai
    public int getNilai() {
        return nilai;
    }

    //setter untuk nilai
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    //getter untuk next
    public Node getNext() {
        return next;
    }

    //setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

}




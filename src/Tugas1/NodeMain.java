package Tugas1;

public class NodeMain {
    public static void main(String[] args) {

        //Membuat node-node
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        //membuat relasi antar node
        n1.setNext (n2);
        n2.setNext (n3);
        n3.setNext (n4);

        //menampilkan nilai node dengan pointer p
        Node P = n1;
        while (P != null) {
            System.out.printf("%d ", P.getNilai());
            P = P.getNext();
        }
    }
}

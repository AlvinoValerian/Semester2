package tugas2;

public class Node {
    String nama;
    int nim;
    Node next;

    Node(String nama,int nilai, Node berikutnya){
        this.nama=nama;
        nim = nilai;
        next = berikutnya;
    }

}
package tugas1;

public class Vaksin05 {
    int noAntri;
    String nama;
    Vaksin05 prev,next;

    Vaksin05(int noAntri,String nama,Vaksin05 prev,Vaksin05 next){
        this.nama=nama;
        this.noAntri=noAntri;
        this.prev=prev;
        this.next=next;
    }
}

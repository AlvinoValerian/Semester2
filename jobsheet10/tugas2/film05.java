package tugas2;

public class film05 {
    String nama;
    int ID;
    float rating;
    film05 prev,next;

    film05(String nama,int ID,float rating,film05 prev,film05 next){
        this.nama=nama;
        this.ID=ID;
        this.rating=rating;
        this.prev=prev;
        this.next=next;
    }
}

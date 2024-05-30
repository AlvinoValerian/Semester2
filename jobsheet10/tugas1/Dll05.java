package tugas1;

public class Dll05 {
    Vaksin05 head;
    int size;

    public Dll05(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int noAntri,String nama){
        if (isEmpty()) {
            head = new Vaksin05(noAntri, nama, null, null);
        }else{
            Vaksin05 node = new Vaksin05(noAntri, nama, null, head);
            head.prev = node;
            head = node;
        }
        size++;
    }
    public void addLast(int noAntri,String nama){
        if (isEmpty()) {
            addFirst(noAntri, nama);
        }else{
            Vaksin05 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Vaksin05 newNode = new Vaksin05(noAntri, nama, current, null);
            current.next = newNode;
            size++;
        }
    }
public int size(){
    return size;
}
public void clear(){
    head = null;
    size=0;
}
public void print(){
    if (!isEmpty()) {
        Vaksin05 tmp = head;
        System.out.println("Nomer\t Nama\t");
        while (tmp != null) {
            System.out.println(tmp.noAntri+"\t" + tmp.nama+"  \t");
            tmp=tmp.next;
        }
        System.out.println("Sisa Antrian: "+size);
    }else{
        System.out.println("Tidak ada Antrian");
    }
}
public void removeFirst() throws Exception{
    if (isEmpty()) {
        throw new Exception("tidak ada yang mengantri");

    }else if (size == 1) {
        removeLast();
    }else{
        head=head.next;
        Vaksin05 penerima = head.prev;
        System.out.println(penerima.nama+ " Telah divaksinasi");
        head.prev=null;
        size--;
    }
}
public void removeLast() throws Exception{
    if (isEmpty()) {
        throw new Exception("tidak ada yang mengantri");

    }else if (head.next == null) {
        Vaksin05 penerima = head;
        System.out.println(penerima.nama+" Telah divaksinasi");
        head=null;
        size--;
        return;
    }
}

}

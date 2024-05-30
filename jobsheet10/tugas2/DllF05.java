package tugas2;
public class DllF05 {
    film05 head;
    int size;

    public DllF05(){
        head = null;
        size = 0;
    }   
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(String nama,int ID,float rating){
        if (isEmpty()) {
            head = new film05(nama, ID, rating, null, null);
        }else{
            film05 newNode = new film05(nama, ID, rating, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(String nama,int ID,float rating){
        if (isEmpty()) {
            addFirst(nama, ID, rating);
            film05 current = head;
            while (current.next != null) {
                current = current.next;
            }
            film05 newNode = new film05(nama, ID, rating, current, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(float rating,int ID,String nama,int index ) throws Exception{
        if (isEmpty()) {
            addFirst(nama, ID, rating);
        }else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            film05 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
              film05 newNode = new film05(nama, ID, rating, null, current);
              current.prev = newNode;
              head=newNode;
            }else{
                film05 newNode = new film05(nama, ID, rating, current.prev, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next= newNode;
                current.prev = newNode;
            }
            
        }
        size++;
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
            film05 tmp = head;
            while (tmp != null) {
                System.out.println("Judul: " + tmp.nama + "\tRating: " + tmp.rating + "\tID: " + tmp.ID);
                tmp=tmp.next;

            }
            System.out.println("\nberhasil diisi!");
        }else{
            System.out.println("lingked list kosong!");
        }
    }
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Lingked list masih kosong");

        }else if (size == 1) {
            removeLast();
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Lingked list masih kosong");

        }else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        film05 current = head;
        while (current.next.next !=null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty() || index >=size ) {
            throw new Exception("Nilai indeks di luar batas");
            
        }else if (index==0) {
            removeFirst();
            }else{
                film05 current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            }else if (current.prev == null) {
                current = current.next;
                current.prev=null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void sortRatingDescending() {
        film05 current = head;
        film05 next = null;
        while (current != null) {
            next = current.next;
            while (next != null) {
                if (current.rating < next.rating) {
                    float tmp = current.rating;
                    current.rating = next.rating;
                    next.rating = tmp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }
    public film05 search(int id){
        if (isEmpty()) {
            System.out.println("Data masih kosong");
            return null;
        }
        film05 current = head;
        while (current != null) {
            if (current.ID == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printSearch(int id){
        film05 Search = search(id);
        if (
            Search != null) {
            System.out.println("Film Ditemukan");
            System.out.println("Id Film     : " + Search.ID);
            System.out.println("Judul Film  : " + Search.nama);
            System.out.println("Rating Film : " + Search.rating);
        } else {
            System.out.println("Id Film Tidak Ditemukan");
        }
    }
}

package tugas1;

public class SingleLinkedList {
    Node head,tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head; 
            System.out.println("Isi Linked List: ");
            int i=1;
            while (tmp != null) {
                System.out.println("Mahasiswa ke-"+i);
                System.out.println("Nama:"+tmp.nama +"-" + "Nim:"+tmp.nim+"\t");
                // System.out.print(tmp.nim + "\t");
                tmp = tmp.next; 
                i++;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    

    void addFirst(String nama,int input){
        Node ndInput = new Node(nama, input, head);

        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(String nama,int input){
        Node ndInput = new Node(nama,input, null);

        if (isEmpty()) {
            head = ndInput;
            tail  = ndInput;
            
        }else{
            tail.next = ndInput;
            tail = ndInput;  
        }
    }
    void InsertAfter(String nama, int key, int input) {
        Node ndInput = new Node(nama, input, null);
        Node temp = head;
        
        while (temp != null) {
            if (temp.nim == key) { // Memeriksa apakah NIM node saat ini sama dengan kunci
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }
    
    void InsertAt(String nama,int index, int input){
        Node ndInput = new Node(nama,input, null);
        if (index > 0) {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            ndInput.next = temp.next; 
            temp.next = ndInput;
            if (temp.next.next == null) {
                tail = temp.next;
            }
        } else if (index == 0) {
            addFirst(nama,input);
        }else if (index == -1) {
            System.out.println("Linked List masih kosong");
        }
    }
    int getdata(int index){
        Node tmp = head;
        for (int i = 0; i < index-1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.nim;
    }
    int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        }else{
            return index;
        }
    }
    void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, Tidak dapat dihapus");
        }else if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, Tidak dapat dihapus"); 
        }else if (head.next == null) {
            head = tail = null;
        }else{
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }
    void remove(int key){
        if (!isEmpty()) {
            System.out.println("Linked List masih kosong, Tidak dapat dihapus"); 
        } else {
            Node temp =head;
            while (temp!=null) {
                if (temp.nim != key && temp == head) {
                    removeFirst();
                    break;
                }else if (temp.next.nim == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        }else{
            Node temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
    }
    


package tugas2;

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
      
    void add(String nama,int input){
        Node ndInput = new Node(nama,input, null);

        if (isEmpty()) {
            head = ndInput;
            tail  = ndInput;
            
        }else{
            tail.next = ndInput;
            tail = ndInput;  
        }
    }
    void remove(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, Tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    
    }

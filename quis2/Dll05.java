
public class Dll05 {

    pelanggan head;
    int size;

    public Dll05(){
        head =null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(String namaPelanggan,String noHp){
        if (isEmpty()) {
            head = new pelanggan(namaPelanggan, noHp, null, null);
        }else{
            pelanggan node = new pelanggan(namaPelanggan, noHp, null, head);
            head.prev = node;
            head = node;
        }
        size++;
    }
    public void addLast(String namaPelanggan,String noHp){
        if (isEmpty()) {
            addFirst(namaPelanggan,noHp);
        }else{
            pelanggan current = head;
            while (current.next != null) {
                current = current.next;
            }
            pelanggan newNode = new pelanggan(namaPelanggan, noHp, current, null);
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
            pelanggan tmp = head;
            System.out.println("Nama\t Nomer\t");
            while (tmp != null) {
                System.out.println(tmp.namaPelanggan+"\t" + tmp.noHp+"  \t");
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
            pelanggan penerima = head.prev;
            System.out.println(penerima.namaPelanggan+ " Selesai Perbaikan");
            head.prev=null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("tidak ada yang mengantri");
    
        }else if (head.next == null) {
            pelanggan penerima = head;
            System.out.println(penerima.namaPelanggan+" Selesai Perbaikan");
            head=null;
            size--;
            return;
        }
    
    }
    public void removeAndAddService(layanan layanan) throws Exception{
        if (!isEmpty()) {
            removeFirst(); 
            LayananService.addService(layanan);
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    
}
    
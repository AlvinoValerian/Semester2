public class LayananService {
    layanan head;
    int size;
        public LayananService(){
            head=null;
            size=0;
        }
    public static int totalPemasukan = 0;

    public static void addService(layanan layanan) {
        totalPemasukan += layanan.getHarga();
    }

    public static int getTotalPemasukan() {
        return totalPemasukan;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void tambahLayanan(int kodeLayanan, String namaLayanan, int harga){
        if (isEmpty()) {
            head = new layanan(kodeLayanan, namaLayanan, harga, null, null);
        } else {
            layanan current = head;
            while (current.next != null) {
                current = current.next;
            }
            layanan newNode = new layanan(kodeLayanan, namaLayanan, harga, current, null);
            current.next = newNode;
        }
        size++;
    }
}
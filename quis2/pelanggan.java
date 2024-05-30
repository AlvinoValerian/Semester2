public class pelanggan {
    String namaPelanggan;
    String noHp;
    pelanggan next,prev;

    pelanggan(String namaPelanggan,String noHp,pelanggan next,pelanggan prev){
        this.namaPelanggan=namaPelanggan;
        this.noHp=noHp;
        this.next=next;
        this.prev=prev;
    }
    public class LayananService {
        private static int totalPemasukan = 0;
    
        public static void addService(layanan layanan) {
            totalPemasukan += layanan.getHarga();
        }
    
        public static int hasilTotalPemasukan() {
            return totalPemasukan;
        }
    }
    
}

public class layanan {
    int kodeLayanan;
    String namaLayanan;
    int harga;
    layanan next1,prev1;
    public layanan next;

    layanan(int kodeLayanan,String namaLayanan,int harga,layanan next1,layanan prev1){
        this.kodeLayanan=kodeLayanan;
        this.namaLayanan=namaLayanan;
        this.harga=harga; 
        this.next1=next1;
        this.prev1=prev1;
    }
    public String hasilNamaLayanan() {
        return namaLayanan;
    }

    public int getHarga() {
        return harga;
    }
        private static int totalPemasukan = 0;
    
        public static void addService(layanan layanan) {
            totalPemasukan += layanan.getHarga();
        }
    
        public static int hasilTotalPemasukan() {
            return totalPemasukan;
        }
    
}

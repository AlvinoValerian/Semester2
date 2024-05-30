public class Gudang05 {
    Barang05[] tumpukan;
    int size;
    int top;

    public Gudang05(int kapasitas){
        size = kapasitas;
        tumpukan= new Barang05[size];
        top =-1;
    }

    public boolean cekKosong(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean cekPenuh(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void tambahBarang(Barang05 brg){
        if (!cekPenuh()) {
            top ++;
            tumpukan[top] = brg;
            System.out.println("Barang " +brg.nama +" Berhasil Di Tambahkan Ke Gudang");
        }else{
            System.out.println("Gagal! Tumpukan Barang Di Gudang Sudah Penuh!");
        }
    }
    public Barang05 ambilBarang(){
        if (!cekKosong()){
            Barang05 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " Diambil Dari Gudang.");
            System.out.println("Kode Unik Dalam Biner: "+KonversiDesimalKeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan Barang Kosong.");
            return null;
        }
    }
        public Barang05 lihatBarangTeratas (){
            if (!isEmpty()){
                Barang05 barangTeratas = tumpukan[top];
                System.out.println("Barang Teratas: "+barangTeratas.nama);
                return barangTeratas;
            }else{
                System.out.println("Tumpukan Barang Kosong.");
                return null;
            }
    }

    public Barang05 lihatBarangTerbawah(){
        if (!isEmpty()){
            Barang05 barangTerbawah = tumpukan[0];
            System.out.println("Barang Terbawah: "+barangTerbawah.nama);
            return barangTerbawah;
        }else{
            System.out.println("Tumpukan Barang Kosong.");
            return null;
        }
}

    public void tampilKanBarang(){
        if (!cekKosong()){
            System.out.println("Rincian tumpukan barang di gudang:");
            for (int i=top;i>=0;i--){
                // for (int i=0;i< top;i++){
                    System.out.printf("Kode %d: %s (Kategori %s)\n",tumpukan[i].kode,tumpukan[i].nama,tumpukan[i].kategori );
                }
                }else{
                    System.out.println("Tumpukan barang kosong.");
            }
        }

    public String KonversiDesimalKeBiner(int kode){
        StacKonversi05 stack = new StacKonversi05();
        while (kode != 0) {
            int sisa = kode % 2 ;
            stack.push(sisa);
            kode =kode/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner+=stack.pop();
        }
        return biner;
    }

    public void hapusBarang(int kodeBarang) {
        if (!isEmpty()) {
            int index = -1; 
            // Cari index barang yang akan dihapus
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kodeBarang) {
                    index = i;
                    break;
                }
            }
            // Hapus barang jika ditemukan
            if (index != -1) {
                for (int i = index; i < top; i++) {
                    tumpukan[i] = tumpukan[i + 1];
                }
                top--;
                System.out.println("Barang dengan kode " + kodeBarang + " berhasil dihapus.");
            } else {
                System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
            }
        } else {
            System.out.println("Tumpukan Barang Kosong.");
        }
    }
    
    }


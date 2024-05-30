public class buku05 {
        String judul,pengarang;
        int halaman,stok,harga,hargaTotal,bayar;
        double diskon;
        void tampilInformasi() {
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " +pengarang);
            System.out.println("Halaman: " +halaman);
            System.out.println("Stok: " + stok);
            System.out.println("Harga: "+ harga);
            System.out.println("Harga Total: "+ hargaTotal);
            System.out.println("Diskon: "+ diskon );
            System.out.println("Harga Bayar: "+ bayar);
            
        }
        void terjual(int jml){
            if(jml <= stok){
                stok -= jml;
                hitungHargaTotal(jml);
            }else{
                System.out.println("Error: Stok Tidak mencukupi ");  
            }  
        }
        void restock(int jml){
            stok += jml;
        }
        void gantiHarga(int hrg){
            harga = hrg;
        }
        
        public buku05(){}
        public buku05(String jud, String pg, int hal, int stok, int har){
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
        void hitungHargaTotal(int jml){
            hargaTotal = harga *jml;
            hitungDiskon();
        }
        void hitungDiskon(){
            if (hargaTotal > 150000){
                diskon = (int) (hargaTotal*0.12);
            }else if(hargaTotal >= 75000){
                diskon =(int) (hargaTotal*0.5);
            }
            hitungHargaBayar();
        }
        void hitungHargaBayar(){
            bayar= (int)(hargaTotal-diskon);
            tampilInformasi();
        }
}
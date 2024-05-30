public class bukuMain {
    public static void main(String[] args) {
        // mengakses atribut
        buku05 bk1 = new buku05();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        // mengakses method
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        buku05 bk2 =new buku05("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        buku05 bukuAlvino = new buku05("Dilan Ancika","Alvino",200,12,50000);
        bukuAlvino.terjual(4);
        bukuAlvino.tampilInformasi();
    }
}

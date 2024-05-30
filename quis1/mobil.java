class Mobil {

    private String merek;
    private String tipe;
    private int kapasitasPenumpang;
    private double hargaSewaPerHari;

    public Mobil(String merek, String tipe, int kapasitasPenumpang, double hargaSewaPerHari) {
        this.merek = merek;
        this.tipe = tipe;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public double hasilHargaTotalSewa(int lamaSewa) {
        return hargaSewaPerHari * lamaSewa;
    }

    @Override
    public String toString() {
        return "Merek: " + merek + "\n" +
                "Tipe: " + tipe + "\n" +
                "Kapasitas Penumpang: " + kapasitasPenumpang + "\n" +
                "Harga Sewa Per Hari: Rp" + hargaSewaPerHari;
    }
}
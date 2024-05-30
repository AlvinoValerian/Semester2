package latihan;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Solaris", "Malang", 520000, (byte)3);
        Hotel h2 = new Hotel("Harris", "Malang", 1000000, (byte)2);
        Hotel h3 = new Hotel("De Batu", "Batu", 360000, (byte)1);
        Hotel h4 = new Hotel("Grand Heaven", "Surabaya", 1500000, (byte)5);
        Hotel h5 = new Hotel("Ibis", "Malang", 600000, (byte)4);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("");
        System.out.println("Data Sebelum Sorting = ");
        list.tampil();

        System.out.println("Data Harga Hotel Setelah Sorting Asc");
        list.hargaBubbleShort();
        list.tampil();

        System.out.println("Data Bintang Hotel Setelah Sorting Desc");
        list.bintangSelectionShort();
        list.tampil();
    }
    
}

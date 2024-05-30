public class fugsi {

    private static final double HARGA_AGLONEMA = 75000;
    private static final double HARGA_KELADI = 50000;
    private static final double HARGA_ALOCASIA = 60000;
    private static final double HARGA_MAWAR = 10000;

    public static void main(String[] args) {
        String[] bunga = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4", "Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[][] stokRoyalGarden = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        System.out.println("1. Pendapatan setiap cabang jika semua bunga habis terjual :");
        pendapatanPerCabang(bunga, stokRoyalGarden);

        System.out.println("\n2. Stock setiap jenis bunga pada cabang RoyalGarden :");
        stockPerJenisBunga(bunga, stokRoyalGarden);

        System.out.println("\n3. Jumlah Stock setelah pengurangan karena bunga mati :");
        int[] stokDikurangi = {-1, -2, 0, -5};
        penguranganStokKarenaMati(bunga, stokRoyalGarden, stokDikurangi);
    }

    private static void pendapatanPerCabang(String[] bunga, int[][] stokRoyalGarden) {
        double[] harga = {0, 0, 0, 0, HARGA_AGLONEMA, HARGA_KELADI, HARGA_ALOCASIA, HARGA_MAWAR};

        for (int i = 0; i < 4; i++) {
            double pendapatan = 0;
            for (int j = 4; j < bunga.length; j++) {
                pendapatan += harga[j] * stokRoyalGarden[i][j - 4];
            }
            System.out.printf("%s: %.2f%n", bunga[i], pendapatan);
        }
    }

    private static void stockPerJenisBunga(String[] bunga, int[][] stokRoyalGarden) {
        for (int i = 4; i < bunga.length; i++) {
            int totalStock = 0;
            for (int[] royalGardenStock : stokRoyalGarden) {
                totalStock += royalGardenStock[i - 4];
            }
            System.out.printf("%s: %d%n", bunga[i], totalStock);
        }
    }

    private static void penguranganStokKarenaMati(String[] bunga, int[][] stokRoyalGarden, int[] stokDikurangi) {
        for (int i = 0; i < bunga.length - 4; i++) {
            for (int j = 0; j < stokRoyalGarden.length; j++) {
                stokRoyalGarden[j][i] += stokDikurangi[i];
            }
        }
        stockPerJenisBunga(bunga, stokRoyalGarden);
    }
}

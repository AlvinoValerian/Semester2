package tugas;

import java.util.Scanner;

public class Queue05 {
    public static void menu() {
        System.out.println();
        System.out.println("Pilih Menu");
        System.out.println("1. Antrian pelanggan baru");
        System.out.println("2. Antrian pelanggan keluar");
        System.out.println("3. Cek Pelanggan terdepan");
        System.out.println("4. Cek Semua pelanggan");
        System.out.println("5. Cek Antrian pelanggan Di posisi belakang");
        System.out.println("6. Cek Posisi pelanggan");
        System.out.println("7. Tampilkan daftar pelanggan");
        System.out.println("===========================================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas Queue05 : ");
        int jumlah = sc.nextInt();
        Pembeli05 antri = new Pembeli05(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) { 
            case 1:
                System.out.print("Nama      : ");
                String nama = sc.nextLine();
                System.out.print("Nomor HP  : ");
                int nomorHP = sc.nextInt();
                Pembeli05 p = new Pembeli05(nama, nomorHP);
                sc.nextLine();
                antri.Enqueue(p);
                break;
            case 2:
                Pembeli05 data = antri.Dequeue();
                if (!"".equals(data.nama) && !"".equals(data.nomorHP)) {
                    System.out.println("Antrian Yang Keluar : " + data.nama + " " + data.nomorHP);
                    break;
                }
            case 3:
                antri.peek();
                break;
            case 4:
                antri.print();
                break;
            case 5:
                antri.peekRear();
                break;
            case 6:
                System.out.print("Nama Pelanggan : ");
                String namaPelanggan = sc.nextLine();
                antri.peekPosition(namaPelanggan);
                break;
            case 7:
                antri.daftarPelanggan();
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
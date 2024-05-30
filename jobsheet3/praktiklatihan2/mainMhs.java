package praktiklatihan2;

import java.util.Scanner;

public class mainMhs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        mahasiswa[] mhs =new mahasiswa[3];

        for(int i =0;i<mhs.length;i++){
            System.out.print("Masukkan Nama Mahasiswa ke-"+i+" :");
            String nama=sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin (L/P):");
            String jenisKelamin=sc.nextLine();
            System.out.print("Masukkan nim: ");
            int nim =sc.nextInt();
            System.out.print("Masukkan Ipk: ");
            double ipk =sc.nextDouble();
            sc.nextLine();
            System.out.println();

            mhs[i]=new mahasiswa(nama, jenisKelamin, nim, ipk);
        }
        for (mahasiswa m : mhs){
            System.out.println("Nama :"+ m.hasilNama());
            System.out.println("Jenis Kelamin :"+ m.hasilJenisKelamin());
            System.out.println("Nim:"+m.hasilNim());
            System.out.println("Ipk:"+m.hasilIpk());
            System.out.println();
        }
        double rataRataIpk = mahasiswa.hitungRataRataIpk(mhs);
    mahasiswa mahasiswaBerprestasi = mahasiswa.findMahasiswaBerprestasi(mhs);

    System.out.println("Rata-rata IPK: " + rataRataIpk);
    System.out.println();
    System.out.println("Mahasiswa dengan IPK Tertinggi:");
    System.out.println("Nama           : " + mahasiswaBerprestasi.hasilNama());
    System.out.println("Jenis Kelamin : " + mahasiswaBerprestasi.hasilJenisKelamin());
    System.out.println("Nim            : " + mahasiswaBerprestasi.hasilNim());
    System.out.println("Ipk            : " + mahasiswaBerprestasi.hasilIpk());

        sc.close();
    }

}

package praktiklatihan2;

public class mahasiswa {
    private String nama;
    private String jenisKelamin;
    private int nim ;
    private double ipk;

    public mahasiswa(String nama,String jenisKelamin,int nim,double ipk){
        this.nama=nama;
        this.jenisKelamin=jenisKelamin;
        this.nim=nim;
        this.ipk=ipk;
    }

    public String hasilNama(){
        return nama;
    }
    public String hasilJenisKelamin(){
        return jenisKelamin;
    }
    public int hasilNim(){
        return nim;
    }
    public double hasilIpk(){
        return ipk;
    }
// no3
    public static double hitungRataRataIpk(mahasiswa[] mhs) {
        double totalIpk = 0;
        for (mahasiswa m : mhs) {
            totalIpk += m.hasilIpk();
        }
        return totalIpk / mhs.length;
    }

    public static mahasiswa findMahasiswaBerprestasi(mahasiswa[] mhs) {
        mahasiswa mahasiswaBerprestasi = mhs[0];
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].hasilIpk() > mahasiswaBerprestasi.hasilIpk()) {
                mahasiswaBerprestasi = mhs[i];
            }
        }
        return mahasiswaBerprestasi;
    }
    

}

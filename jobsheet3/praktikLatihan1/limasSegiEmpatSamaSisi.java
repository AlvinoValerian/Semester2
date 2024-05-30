public class limasSegiEmpatSamaSisi {
    private double sisiAlas;
    private double tinggiLimas;
    private double luasPermukaan;
    private double volume;

    public limasSegiEmpatSamaSisi(double sisiAlas,double tinggiLimas){
        this.sisiAlas=sisiAlas;
        this.tinggiLimas=tinggiLimas;
        hitungLuasPermukaan();
        hitungVolume();
    }
    private void hitungLuasPermukaan(){
        luasPermukaan = 2*sisiAlas*sisiAlas+4*(sisiAlas*tinggiLimas/2);
    }
    private void hitungVolume(){
        volume= (1.0/3.0)*sisiAlas*sisiAlas*tinggiLimas;
    }
    public double hasilLp(){
        return luasPermukaan;
    }
    public double hasilV(){
        return volume;
    }

}

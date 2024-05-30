public class bola {
    private double jariJari;
    private double luasPermukaan;
    private double volume;

    public bola(double jariJari){
        this.jariJari=jariJari;
        hitungLuasPermukaan();
        hitungVolume();
    }
    private void hitungLuasPermukaan(){
        luasPermukaan= 4*Math.PI*jariJari*jariJari;
    }
    private void hitungVolume(){
        volume= (4.0/3.0)*Math.PI*jariJari*jariJari*jariJari;
    }
    public double hasilLp(){
        return luasPermukaan;
    }
    public double hasilV(){
        return volume;
    }
}

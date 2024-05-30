class kerucut {

    private double jariJari;
    private double sisiMiring;
    private double luasPermukaan;
    private double Volume;

    public kerucut(double jariJari,double sisiMiring,double tinggi){
        this.jariJari=jariJari;
        this.sisiMiring=sisiMiring;
        hitungluasPermukaan();
        hitungVolume();
    }
    private void hitungluasPermukaan(){
        luasPermukaan = Math.PI*jariJari*(jariJari+sisiMiring);
    }
    private void hitungVolume(){
        double tinggiKerucut;
        tinggiKerucut= Math.pow(sisiMiring,2) - Math.pow(jariJari, 2);
        tinggiKerucut= Math.sqrt(2);
        Volume = (1.0/3.0)*Math.PI*jariJari*jariJari*tinggiKerucut;
    }
    public double hasilLp(){
        return luasPermukaan;
    }
    public double hasilV(){
        return Volume;
    }
    }

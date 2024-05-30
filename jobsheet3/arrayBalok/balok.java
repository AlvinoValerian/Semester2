package arrayBalok;
public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public balok(int p,int l,int t){
        
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    // public balok(int p,int l){
    //     this.panjang=p;
    //     this.lebar=l;
    // }
    
    public int hitungVolume(){
        return panjang *lebar* tinggi;
    }
    
}
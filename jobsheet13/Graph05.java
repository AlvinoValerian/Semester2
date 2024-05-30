public class Graph05 {
    public static boolean cekJalur;
    int vertex;
    DoubleLingkedLists05 list[];

    public Graph05(int v){
        vertex = v;
        list= new DoubleLingkedLists05[v];
        for (int i = 0 ;i < v; i++ ) {
            list[i] = new DoubleLingkedLists05();
        }
    }
    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
        // undirected graph
        // list[tujuan].addFirst(asal, jarak);
    }
    
    public void degree(int asal) throws Exception{
        int k, totalIn =0,totalOut = 0;
        for (int i = 0 ; i < vertex; i++ ) {
            // inDegree
            for ( int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal){
                    ++totalIn;
                }
            }
            // outDegree
            for(k=0 ; k<list[asal].size(); k++){
                list[asal].get(k);
            }
            totalOut =k;
        }
        System.out.println("inDegree dari gedung"+ (char) ('A'+asal)+ ": "+totalIn);
        System.out.println("outDegree dari gedung"+ (char) ('A'+asal)+ ": "+totalOut);
        System.out.println("Degree dari gedung"+ (char) ('A'+asal)+ ": "+totalIn + totalOut);
        // undirected graph
        // System.out.println("Degree dari gedung"+ (char) ('A'+asal)+ ": "+list[asal].size());
    }
    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++){
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }
    public void removeAllEdges(){
        for(int i=0 ; i<vertex;i++){
            list[i].clear();
        }
        System.out.println("graf berhasil dikosongkan");
    }
    public void printGraph() throws Exception {
        for (int i =0; i < vertex;i++){
            if (list[i].size() > 0) {
                System.out.println("gedung "+(char) ('A' +i) + " terhubung dengan ");
                for (int j=0 ; j < list[i].size(); j++){
                    System.out.print((char) ('A'+list[i].get(j))+" ("+list[i].getJarak(j)+" m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    public boolean cekJalur(int asal, int tujuan) {
        for (int i = 0; i < list[asal].size(); i++) {
            try {
                if (list[asal].get(i) == tujuan) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public void cetakJalur(int asal, int tujuan) {
        if (cekJalur(asal, tujuan)) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
        System.out.println("");
    }
    public void updateJarak(int asal, int tujuan, int jarak) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                list[asal].updateJarak(i, jarak);
                return;
            }
        }
        throw new Exception("Edge tidak ditemukan.");
    }

    public int hitungEdge() {
        int count = 0;
        for (int i = 0; i < vertex; i++) {
            count += list[i].size();
        }
        return count;
    }
}

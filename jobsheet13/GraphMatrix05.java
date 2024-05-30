public class GraphMatrix05 {
    int vertex;
    int [][] matrix;

    public GraphMatrix05(int v){
        vertex = v;
        matrix = new int[v][v];
    }
    public void makeEdge(int asal, int tujuan, int jarak){
        matrix[asal][tujuan] = jarak;
    }
    public void removeEdge(int asal, int tujuan){
        matrix[asal][tujuan] = -1;
    }
    public void printGraph(){
        for (int i = 0; i < vertex; i++){
            System.out.print("\nGedung " +(char) ('A' + i) + ": ");
            for(int j =0;j<vertex; j++){
                if (matrix[i][j] != -1){
                    if (matrix[i][j] != -1) {
                        System.out.print("Gedung "+(char)('A' + j) + " (" + matrix[i][j] + " m), ");
                    }
                }
                System.out.print("");
            }
        }
    }
    public int getInDegree(int v) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matrix[i][v] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int getOutDegree(int v) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matrix[v][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public void degree(int v) {
        int inDegree = getInDegree(v);
        int outDegree = getOutDegree(v);
        System.out.println("inDegree dari gedung " + (char) ('A' + v) + ": " + inDegree);
        System.out.println("outDegree dari gedung " + (char) ('A' + v) + ": " + outDegree);
        System.out.println("Degree dari gedung " + (char) ('A' + v) + ": " + (inDegree + outDegree));
    }

}

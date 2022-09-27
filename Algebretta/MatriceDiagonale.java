package Algebretta;

import java.util.Objects;

public class MatriceDiagonale extends AbsMatrice {
    private int[] valori;

    public MatriceDiagonale(int[] v){
        valori = v.clone();
    }

    @Override
    public int dim() {
        return valori.length;
    }

    @Override
    public int val(int r, int c) {
        Objects.requireNonNull(r, "r non può essere NULL");
        Objects.requireNonNull(c, "c non può essere NULL");
        if (r < 0 || r >= dim()) throw new IndexOutOfBoundsException("L'indice della riga deve essere interno alla matrice");
        if (c < 0 || c >= dim()) throw new IndexOutOfBoundsException("L'indice della colonna deve essere interno alla matrice");
        if (r == c) return valori[r]; 
        return 0;
    }

    @Override
    public Matrice per(int alpha) {
        Objects.requireNonNull(alpha, "il parametro non può essere NULL");
        int[] prodotto = new int[dim()];
        for (int i=0; i<dim(); i++)
            prodotto[i] = valori[i]*alpha;
        return new MatriceDiagonale(prodotto);
    }

    @Override
    public Matrice per(Matrice v) {
        Objects.requireNonNull(v, "La matrice non può essere NULL");
        if (!conforme(v)) throw new IllegalArgumentException("Le due matrici non sono conformi!");
        if (v instanceof MatriceIdentità) return this;
        if (v instanceof MatriceNulla) return new MatriceNulla(v.dim());
        if (v instanceof MatriceDiagonale) {
            int[] support = new int[v.dim()];
            for (int i=0; i<v.dim(); i++)
                support[i] = val(i, i) * v.val(i, i);
            return new MatriceDiagonale(support);
        }
        int[][] temp = new int[dim()][dim()];
        for (int i = 0; i < dim(); i++){
            int somma = 0;
            for (int j = 0; j < dim(); j++)
                somma += val(i, j) * v.val(j, i);
            
        }

        return null;
    }

    @Override
    public Matrice più(Matrice v) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

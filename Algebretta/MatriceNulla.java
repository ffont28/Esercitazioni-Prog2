package Algebretta;

import java.util.Objects;

public class MatriceNulla extends AbsMatrice{
    private int dimensione;

    public MatriceNulla(int d){
        dimensione = d;
    }

    @Override
    public int dim() {
        return dimensione;
    }

    @Override
    public int val(int r, int c) {
        Objects.requireNonNull(r, "r non può essere NULL");
        Objects.requireNonNull(c, "c non può essere NULL");
        if (r < 0 || r >= dimensione) throw new IndexOutOfBoundsException("L'indice della riga deve essere interno alla matrice");
        if (c < 0 || c >= dimensione) throw new IndexOutOfBoundsException("L'indice della colonna deve essere interno alla matrice");
        return 0;
    }

    @Override
    public Matrice per(int alpha) {
        Objects.requireNonNull(alpha, "il valore per cui moltiplicare la matrice non può essere NULL");
        return this;
    }

    @Override
    public Matrice per(Matrice v) {
        Objects.requireNonNull(v, "il valore per cui moltiplicare la matrice non può essere NULL");
        if (!conforme(v)) throw new IllegalArgumentException("Le matrici non sono conformi");
        return this;
    }

    @Override
    public Matrice più(Matrice v) {
        Objects.requireNonNull(v, "il valore per cui moltiplicare la matrice non può essere NULL");
        if (!conforme(v)) throw new IllegalArgumentException("Le matrici non sono conformi");
        return v;
    }    
}

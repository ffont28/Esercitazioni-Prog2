package Algebretta;

import java.util.Objects;

public class MatriceDensa extends AbsMatrice{
    private int[][] matrice;

    public MatriceDensa(int[][] input){
        Objects.requireNonNull(input,"Non posso istanziare una matrice partendo da NULL");
        if (dim()<=0) throw new IllegalArgumentException("Non ha senso istanziare una matrice con dimensione negativa");
        for (int i=0; i<dim(); i++)
            for (int j=0; j<dim(); j++)
                matrice[i][j] = input[i][j];
    }

    @Override
    public int dim() {
        return matrice.length;
    }

    @Override
    public int val(int r, int c) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Matrice per(int alpha) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Matrice per(Matrice v) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Matrice più(Matrice v) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

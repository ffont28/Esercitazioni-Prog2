package ConGabri;

import java.util.Objects;

/*
 * Le istanze di questa classe rappresentano un quadrilatero. Le istanze di questa classe non sono mutabili
 */
public abstract class Quadrilateri implements FigureGeometriche{
    protected final int lato1, lato2, lato3, lato4;
    
    /**
     * Costruttore di un quadrilatero generico
     * @param l1 il lato 1
     * @param l2
     * @param l3
     * @param l4
     * @throws NullPointerException se {@code l1} è null
     * @throws IllegalArgumentException se {@code l1} è null
     */
    public Quadrilateri(int l1,int l2, int l3,int l4){
        //lato1 = Objects.requireNonNull(l1, "L'oggetto 1 è null");
        Objects.requireNonNull(l1, "L1 non èuò essere null");
         if (l1>0) this.lato1=l1; 
          else throw new IllegalArgumentException("L1 non può essere negativo");


        this.lato2 = Objects.requireNonNull(l2, "L'oggetto 2 è null");
        this.lato3 = Objects.requireNonNull(l3, "L'oggetto 3 è null");
        this.lato4 = Objects.requireNonNull(l4, "L'oggetto 4 è null");
    }

    @Override
    public int perimetro() {
        return lato1+lato2+lato3+lato4;
    }
}

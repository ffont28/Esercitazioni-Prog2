package Algebretta;

public interface Matrice {
 /**
     * Metodo che restituisce la dimensione di una Matrice
     * 
     * @return la dimensione della matrice
     */
    int dim();

    /**
     * @param r la riga della matrice di cui si vuole conoscere il valore
     * @param c la colonna della matrice di cui si vuole conoscere il valore
     * @return il valore presente nella matrice, in posizione [<b>r</b>,<b>c</b>]
     */
    int val(final int r, final int c);

    /**
     * 
     * @param alpha il valore scalare per cui moltiplicare il vettore
     * @return il vettore risultante dal prodotto scalare <b>this</b> x <b>alpha</b>
     * @throws NullPointerException se {@code alpha} è null
     */
    Matrice per(final int alpha);

    /**
     * 
     * @param v un vettore per cui moltiplicare il vettore
     * @return la matrice risultante dal prodotto scalare <b>this</b> x <b>alpha</b>
     * @throws NullPointerException se v è null
     */
    Matrice per(final Matrice v);

    /**
     * 
     * @param v un vettore per cui moltiplicare il vettore
     * @return la matrice risultante dalla somma matriciale <b>this</b> + <b>v</b>
     * @throws NullPointerException se v è null
     */
    Matrice più(final Matrice v);


    /**
     * 
     * @param v la Matrice di cui controllare la conformità
     * @return {@code true} se le due matrici hanno stessa dimensione, {@code false} altrimenti
     */
    default boolean conforme(Matrice v){
        return dim()==v.dim();
    }

}

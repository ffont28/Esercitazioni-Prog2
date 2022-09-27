package Algebretta;

public interface Vettore {
    /**
     * Metodo che restituisce la dimensione di un Vettore
     * 
     * @return la dimensione del vettore
     */
    int dim();

    /**
     * 
     * @param i l'indice del vettore di cui si vuole conoscere il valore
     * @return il valore del vettore in posizione <b>i</b>
     */
    int val(final int i);

    /**
     * 
     * @param alpha il valore scalare per cui moltiplicare il vettore
     * @return il vettore risultante dal prodotto scalare <b>Vettore</b> x <b>alpha</b>
     */
    Vettore per(final int alpha);

    /**
     * 
     * @param v un vettore per cui moltiplicare il vettore
     * @return il vettore risultante dal prodotto vettoriale <b>Vettore</b> x <b>v</b>
     * @throws NullPointerException se v è null
     */
    Vettore più(final Vettore v);

    /**
     * 
     * @param v il Vettore di cui controllare la conformità
     * @return {@code true} se i due vettori hanno stessa dimensione, {@code false} altrimenti
     */
    default boolean conforme(Vettore v){
        return dim()==v.dim();
    }
}

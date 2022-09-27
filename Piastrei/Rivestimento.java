package Piastrei;

public interface Rivestimento {
    /**
     * Restituisce il costo del rivestimento.
     *
     * @return il costo, ha sempre valore positivo.
     */
    int costo();
  
    /**
     * Restituisce la superficie del rivestimento.
     *
     * @return la superficie, ha sempre valore positivo.
     */
    int superficie();
  }
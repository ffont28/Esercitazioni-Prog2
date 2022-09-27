package Piastrei;

public abstract class Piastrella implements Rivestimento {

    /** Il costo della piastrella, è sempre positivo. */
    private final int costo;
  
    /**
     * Costruisce una piastrella dato il suo costo.
     *
     * @param costo il costo.
     * @throws IllegalArgumentException se il costo non è positivo.
     */
    public Piastrella(final int costo) {
      if (costo <= 0) throw new IllegalArgumentException("Il costo dev'essere positivo.");
      this.costo = costo;
    }
  
    @Override
    public int costo() {
      return costo;
    }
  }

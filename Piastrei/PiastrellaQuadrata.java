package Piastrei;

public class PiastrellaQuadrata extends Piastrella {

    /** Il lato della piastrella, è sempre positivo. */
    public final int lato;
  
    /**
     * Costruisce una piastrella dato il suo <em>costo</em> e <em>lato</em>.
     *
     * @param lato il lato.
     * @param costo il costo.
     * @throws IllegalArgumentException se il costo, o il lato, non sono positivi.
     */
    public PiastrellaQuadrata(final int lato, final int costo) {
      super(costo);
      if (lato <= 0) throw new IllegalArgumentException("Il lato dev'essere positivo.");
      this.lato = lato;
    }
  
    @Override
    public int superficie() {
      return lato * lato;
    }
  }
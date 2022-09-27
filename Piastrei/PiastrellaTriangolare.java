package Piastrei;

public class PiastrellaTriangolare extends Piastrella {

    /** La base, è sempre positiva. */
    public final int base;
  
    /** L'altezza, è sempre positiva. */
    public final int altezza;
  
    /**
     * Costruisce una piastrella dato il suo <em>costo</em> e la lunghezza della sua <em>base</em> e
     * <em>altezza</em>.
     *
     * @param base la base.
     * @param altezza l'altezza.
     * @param costo il costo.
     * @throws IllegalArgumentException se il costo, la base, o l'altezza, non sono positivi.
     */
    public PiastrellaTriangolare(final int base, final int altezza, final int costo) {
      super(costo);
      if (base <= 0) throw new IllegalArgumentException("La base dev'essere positiva.");
      if (altezza <= 0) throw new IllegalArgumentException("L'altezza dev'essere positiva.");
      this.base = base;
      this.altezza = altezza;
    }
  
    @Override
    public int superficie() {
      return (base * altezza) / 2;
    }
  }
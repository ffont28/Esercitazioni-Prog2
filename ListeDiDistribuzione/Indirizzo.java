package ListeDiDistribuzione;

public class Indirizzo implements ListeInterf{
    final Locale l;
    final Dominio d;

    public Indirizzo(Locale loc, Dominio dom) {
        l = loc;
        d = dom;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Indirizzo)) return false;
        final Indirizzo temp = (Indirizzo) obj;
        return this.l.equals(temp.l) && this.d.equals(temp.d);                
    }

    @Override
    public String toString() {
        return l.toString() + "@" + d.toString();
    }

    
}

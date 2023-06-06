package ListeDiDistribuzione;

import java.util.Objects;

public abstract class Liste implements Iterable<Indirizzo>{
    public final String nome;
    
    // AF: il nome  di una lista di distro
    // RI: nome non null e non stringa vuota
    
    public Liste(String nome) {
        this.nome = Objects.requireNonNull(nome, "il nome della lista non può essere NULL");
        if (nome.isBlank()) throw new IllegalArgumentException("Il nome non può essere una stringa vuota");
        

    }

    public boolean contiene(Indirizzo addr){
        for (Indirizzo i : this)
            if (i.equals(addr)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Liste)) return false;
        final Liste temp = (Liste) obj;
        return this.nome.equals(temp.nome);                
    }
     @Override
     public String toString() {
         final StringBuilder sb = new StringBuilder("List " + nome + ":\n");
         for (Indirizzo i : this) {
            sb.append(i + "\n");
         }
         return sb.toString();
     }

    
}

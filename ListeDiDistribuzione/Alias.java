package ListeDiDistribuzione;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public class Alias implements Iterable<Indirizzo> {

    public final String nome;
    private final Set<Locale> lista = new HashSet<>();
    public final Dominio dominio;

    public Alias(String n, Dominio d, List<Locale> li){
        nome = Objects.requireNonNull(n, "non puoi dare NULL come nome");
        if (n.isBlank()) throw new IllegalArgumentException("Il nome non può essere una stringa vuota!");
        lista.addAll(li);
        dominio = d;
    }

    //@Override
    public void aggiungi(Locale l) {
        lista.add(l);
    }

    //@Override
    public void rimuovi(Locale l) {
        lista.remove(l);
    }

    //@Override
    public boolean contiene(Locale l) {
        return lista.contains(l);
    }


    @Override
    public Iterator<Indirizzo> iterator() {
        return new Iterator<Indirizzo>() {
            private final Iterator<Locale> it = lista.iterator();
            private Indirizzo next = null;


            @Override
            public boolean hasNext() {
                if (next != null) return true;
                while (it.hasNext()) {
                    next = new Indirizzo(it.next(), dominio);
                    return true;
                  }
                  return false;
            }

            @Override
            public Indirizzo next() {
                if (!hasNext()) throw new NoSuchElementException();
                final Indirizzo result = next;
                next = null;
                return result;
            }
            
        };
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Alias " + nome + " =\n");
        for (Locale locale : lista)
            sb.append("  "+ locale+"@"+dominio+"\n");
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }


    
}

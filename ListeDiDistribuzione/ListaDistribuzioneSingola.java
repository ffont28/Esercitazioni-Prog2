package ListeDiDistribuzione;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ListaDistribuzioneSingola extends Liste{
    private final Alias alias;


    public ListaDistribuzioneSingola(String nome, Alias a) {
        super(nome);
        alias = Objects.requireNonNull(a, "non puoi passare un Alias NULL come argomento!");
    
    }

    @Override
    public Iterator<Indirizzo> iterator() {
        return new Iterator<Indirizzo>() {
            private final Iterator<Indirizzo> it = alias.iterator();
            private Indirizzo next = null;


            @Override
            public boolean hasNext() {
                if (next != null) return true;
                while (it.hasNext()) {
                    next = it.next();
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


}

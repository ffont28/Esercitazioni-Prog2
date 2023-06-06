package ListeDiDistribuzione;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ListaDistribuzioneDifferenza extends Liste{

    private Liste alias1;
    private Liste alias2;

    public ListaDistribuzioneDifferenza(String nome, Liste a1, Liste a2) {
        super(nome);
        alias1 = Objects.requireNonNull(a1, "argomento NULL");
        alias2 = Objects.requireNonNull(a2, "argomento NULL");
    }

    @Override
    public Iterator<Indirizzo> iterator() {
        return new Iterator<Indirizzo>() {
            private final Iterator<Indirizzo> it1 = alias1.iterator();
            private Indirizzo next = null;


            @Override
            public boolean hasNext() {
                if (next != null) return true;
                while (it1.hasNext()) {
                    Indirizzo candidato1 = it1.next();
                    if (!alias2.contiene(candidato1)){
                        next = it1.next();
                        return true;
                    }
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

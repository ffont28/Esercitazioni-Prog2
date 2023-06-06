package ListeDiDistribuzione_copy;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Alias extends Dominio {

    private final List<ListeInterf> lista;
    private final String nome;

    public Alias(String n, String d, List<ListeInterf> li){
        super(d);
        nome = Objects.requireNonNull(n, "non puoi passare un nome null");
        lista = Objects.requireNonNull(li);
    }

    //@Override
    public void aggiungi(ListeInterf li) {
        lista.add(li);
    }

    //@Override
    public void rimuovi(ListeInterf li) {
        lista.remove(li);
    }

    //@Override
    public boolean contiene(ListeInterf li) {
        return lista.contains(li);
    }
    

    @Override
    public Iterator<Indirizzo> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (ListeInterf listeInterf : lista) {
            sb.append(listeInterf.toString() + "@" + d +"\n");
        }
        return sb.toString();
    }


    
}

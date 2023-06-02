package ListeDiDistribuzione;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Componente {
    final Predicate<String> VALIDO;
    public final String part;

    public Componente(String s, String er){
        Objects.requireNonNull(s, "Non puoi passare un riferimento a NULL");
        VALIDO = Pattern.compile(er).asPredicate();
        if (VALIDO.test(s)) part = s;
        else throw new IllegalArgumentException("Non è stato rispettato il pattern di input in " + s + "\n su base di " + er);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Componente)) return false;
        final Componente temp = (Componente) obj;
        return this.part.equals(temp.part);                
    }

    @Override
    public String toString() {
        return part;
    }
}

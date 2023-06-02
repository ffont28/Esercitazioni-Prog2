package ListeDistro2;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Locale extends Componente{

    private static final String er = "^[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*$";
    final static Predicate<String> VALIDO = Pattern.compile(er).asPredicate();
    
    public Locale(String s) {
        super(s, er);
    }
    
}

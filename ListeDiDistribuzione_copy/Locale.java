package ListeDiDistribuzione_copy;

public class Locale extends Componente{
    private static final String er = "^[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*$";
    
    public Locale(String s) {
        super(s, er);
    }
    
}

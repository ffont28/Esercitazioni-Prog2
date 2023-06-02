package ListeDistro2;

public class Dominio extends Componente{
    private static final String er = "^[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    public Dominio(String s) {
        super(s, er);
    }
    
}

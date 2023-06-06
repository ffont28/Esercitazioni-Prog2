package ListeDiDistribuzione_copy;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Locale l = new Locale("francesco");
        Locale l2 = new Locale("gabriele");
        Dominio d = new Dominio("mattei.it");
        System.out.println(l.toString() + " - " + l2.toString());
        System.out.println(l.equals(l2));

        List<ListeInterf> in = new ArrayList<>();
        in.add(l);
        in.add(l2);
        ListeInterf i = new Indirizzo(new Locale("francesco"), new Dominio("uni.it"));
        Alias a = new Alias("Professori", "mattei.it", in);
        System.out.println(a.toString());
        a.aggiungi(i);
        System.out.println(a.toString());
        //a.aggiungi(a);
        System.out.println("---");
        System.out.println(a.toString());
    }
}

package ListeDiDistribuzione;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Locale l0 = new Locale("francesco");
        Locale l1 = new Locale("francesco");
        Locale l2 = new Locale("gabriele");
        Locale l3 = new Locale("francesco");
        Locale l4 = new Locale("gabriella");
        Locale l5 = new Locale("gabriello");
        Dominio d = new Dominio("itisondrio.org");

        List<Locale> list1 = new ArrayList<>();
        list1.add(l0);
        list1.add(l1);
        list1.add(l2);
        List<Locale> list2 = new ArrayList<>();
        list2.add(l3);
        list2.add(l4);
        list2.add(l5);

        Alias a1 = new Alias("Alias1", d , list1);
        Alias a2 = new Alias("Alias2", d, list2);
        Liste lista1 = new ListaDistribuzioneSingola("Lista1", a1);
        Liste lista2 = new ListaDistribuzioneSingola("Lista2", a2);
        ListaDistribuzioneSomma lds = new ListaDistribuzioneSomma("SOMMA", lista1, lista2);
        System.out.println(lds.toString());
        a2.rimuovi(l4);
        System.out.println(lds.toString());
        ListaDistribuzioneDifferenza ldd = new ListaDistribuzioneDifferenza("DIFFERENZA",  lista1, lista2);
        System.out.println(ldd);
    }
}

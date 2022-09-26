package ConGabri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Triangolo {
    private int lato1, lato2, lato3;


    public Triangolo(int l1, int l2, int l3){
        this.lato1 = l1;
        this.lato2 = l2;
        this.lato3 = l3;
    }

    public Triangolo(){}

    public int getLato1() {
        return lato1;
    }

    public void setLato1(int lato1) {
        this.lato1 = lato1;
    }

    public int getLato2() {
        return lato2;
    }

    public void setLato2(int lato2) {
        this.lato2 = lato2;
    }

    public int getLato3() {
        return lato3;
    }

    public void setLato3(int lato3) {
        this.lato3 = lato3;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + lato1;
        result = prime * result + lato2;
        result = prime * result + lato3;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Triangolo other = (Triangolo) obj;
        if (lato1 != other.lato1)
            return false;
        if (lato2 != other.lato2)
            return false;
        if (lato3 != other.lato3)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Triangolo t = new Triangolo();
        t.setLato1(3);
        t.setLato2(4);
        t.setLato3(5); 
        Triangolo t2 = new Triangolo(3, 4, 5);
        System.out.println(t.equals(t2));

        Map<Integer,String> mappa = new HashMap<>();
        mappa.put(1, "Pighizzini");
        mappa.put(3, "Lonati");
        mappa.put(2, "Malchiodi");

        System.out.println(mappa.toString());
        mappa.put(1, "Dino");
        System.out.println(mappa.toString());
        System.out.println(mappa.get(1).equals(mappa.get(3)));
        mappa.put(3, "Dino");
        System.out.println(mappa.get(1).equals(mappa.get(3)));
        mappa.clear();
        System.out.println(mappa.toString());


        HashSet<Integer> lista = new HashSet<>();
        System.out.println(lista.toString());
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.toString());
        lista.add(2);
        lista.add(2);
        System.out.println(lista.toString());

    }

}

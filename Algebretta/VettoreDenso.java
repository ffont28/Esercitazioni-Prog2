package Algebretta;

import java.util.Objects;

public class VettoreDenso implements Vettore{
    private int[] values;

    public VettoreDenso(int[] input){
        Objects.requireNonNull(input, "L'array non può essere null");
        if (input.length==0) throw new IllegalArgumentException("Il vettore deve contenere almeno un elemento!");
        values = input.clone();

    }

    @Override
    public int dim() {
        return values.length;
    }

    @Override
    public int val(int i) {
        if (i<0 || i>values.length) throw new IllegalArgumentException("L'indice del vettore deve esser compreso tra 0 e la dimensione del vettore");
        return values[i];
    }

    @Override
    public Vettore per(int alpha) {
        Objects.requireNonNull(alpha, "L'input del metodo non può essere null");
        int[] prodotto = new int[values.length];
        for (int i=0; i<values.length; i++) prodotto[i]=values[i]*alpha;
        VettoreDenso result = new VettoreDenso(prodotto);
        return result;
    }

    @Override
    public Vettore più(Vettore v) {
        Objects.requireNonNull(v,"Il vettore da moltiplicare non può essere null");
        if (!this.conforme(v)) throw new IllegalArgumentException("I due vettori devono avere stessa dimensione!");
        int[] somma = new int[values.length];
        for(int i=0; i<values.length;i++)
            somma[i] = values[i] + v.val(i);
        return new VettoreDenso(somma);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("(" + values[0]);
        for (int i=1; i<values.length; i++) 
            s.append(", " + values[i]);
        s.append(")");
        return s.toString();
    }
    
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4};
        int [] ar2 = {2,3,4,5};
        VettoreDenso vd1 = new VettoreDenso(ar1);
        VettoreDenso vd2 = new VettoreDenso(ar2);
        System.out.println(vd1.toString());
        System.out.println("SOMMA :" + vd1.più(vd2).toString());
        System.out.println("PRODOTTO :" + vd1.per(10).toString());
    }
}
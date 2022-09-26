import java.util.Objects;

public class Class1{
    int numero;
    static int numerostatico;
    String nome;


    /**
     * 
     * @param n il numero
     * @param ns il numero statico
     * @param s la stringa
     * @throws IllegalArgumentException se è null
     */
    public Class1(int n, int ns, String s){
        numero = Objects.requireNonNull(n);
        numerostatico = ns;
        nome = s;
    }

    @Override
    public String toString() {
        return numero + " - " + numerostatico + " - " + nome;
    }

    public static void main(String[] args) {
        System.out.println("Hello, starting");
        Class1 c1 = new Class1(1, 1, "CIuno");
        System.out.println(c1);
        Class1 c2 = new Class1(2, 2, "CIdue");
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        Class1 c5 = new Class1(5, 5, "CIcinque");
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        System.out.println("C5: " + c5);
    }
}
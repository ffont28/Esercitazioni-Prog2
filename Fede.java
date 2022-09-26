public class Fede{
    public static void main(String[] args) {
        System.out.println("Ciao" + "Fede");
        System.out.println("CiaoFede");
        int numero = 5;
        System.out.println("Il doppio di " + numero + " è: " + (Doppio(numero)+2));
    }

    public static int Doppio(int x){
        return x*2;
    }
}
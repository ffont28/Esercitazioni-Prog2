package ListeDistro2;

public class Test {
    public static void main(String[] args) {
        Locale l = new Locale("francesco");
        System.out.println(l.toString());
        Locale l2 = new Locale("Francesco");
        System.out.println(l.equals(l2));
    }
}

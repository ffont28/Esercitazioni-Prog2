package ListeDiDistribuzione;

public class Test1 {
    public static void main(String[] args) {
        ListeInterf l = new Locale("francesco");
        ListeInterf l2 = new Locale("francesco");
        System.out.println(l.toString() + " - " + l2.toString());
        System.out.println(l.equals(l2));
    }
}

package ListeDiDistribuzione;

public class Test1 {
    public static void main(String[] args) {
        Locale l = new Locale("francesco");
        Locale l2 = new Locale("Francesco");
        System.out.println(l.toString() + " - " + l2.toString());
        System.out.println(l.equals(l2));
    }
}

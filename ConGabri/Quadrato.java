package ConGabri;

public class Quadrato extends Quadrilateri {

    public Quadrato(int l1, int l2, int l3, int l4) {
        super(l1, l2, l3, l4);
    }

    @Override
    public int area() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public static void main(String[] args) {
        Quadrato q = new Quadrato(1, 2, 3, 4);
        System.out.println("Perimetro: " + q.perimetro());
        
    }

}

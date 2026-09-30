package Examples;

public class bTest {
    public static void main(String[] args) {
        bStore s=new bStore();
        s.addProduct(new bPencil());
        s.addProduct(new bPencil());
        s.addProduct(new bPen());
        s.addProduct(new bStationary());
        s.addProduct(new Object());
        s.listProducts();
    }
}

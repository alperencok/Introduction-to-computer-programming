package Examples;

public class MidtermQuestion4Test {
    public static void main(String[] args) {
        Product p1=new Product();
        p1.price=5000;
        Product p2=new Product();
        p2.price=5000;
        Product highest=p1.getMaxProduct(p1, p2);
        System.out.println(highest.price);
    }
}

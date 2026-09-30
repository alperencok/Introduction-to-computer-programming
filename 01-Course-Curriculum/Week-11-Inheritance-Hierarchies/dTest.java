package Examples;

public class dTest {
    public static void main(String[] args) {
        bFactory f=new bFactory();
        f.addProduct(new cProduct("Pen",10), 0);
        f.addProduct(new cProduct("Pencil",3), 1);
        f.addProduct(new cProduct("Book",7), 3);
        f.addProduct(new cProduct("Eraser",10), 10);

        f.removeProduct("Pen");
        System.out.println(f.getProductCount());
        System.out.println(f.getProductTotalPrice());

        System.out.println(f.increaseProductPrice("Book",10));

    }
}

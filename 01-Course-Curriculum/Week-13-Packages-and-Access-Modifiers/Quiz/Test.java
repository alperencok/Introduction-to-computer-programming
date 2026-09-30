package Examples.Quiz;

public class Test {
    public static void main(String[] args) {
        Order o =new Order();
        Order o1=new Order(o);

        Customer c1 = new Customer(1, "Alex", "Taylor");

        Product p1 = new Product("Laptop", 4000);
        Product p2 = new Product("Mouse", 250);
        Product p3 = new Product("Keyboard", 500);

        Order o2 = new Order(c1, 2);

        o2.addProduct(p1);
        o2.addProduct(p2);

        System.out.println(o2.calculateTotalPrice());

    }
}

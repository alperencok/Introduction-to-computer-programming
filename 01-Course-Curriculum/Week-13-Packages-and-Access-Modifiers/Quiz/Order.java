package Examples.Quiz;

public class Order {

    Product products[] = new Product[3];
    Customer c;
    int date, SalesPrice, Unit;

    /*Add a constructor to the Order class that takes an order as a parameter and
adds a new order to the customer's order array list when a new order is created.*/
    Order(Order o) {
        Customer.orders.add(o);
    }

    Order() {
        Customer.orders.add(this);
    }
    int count = 0;

    void addProduct(Product p) {
        products[count] = p;
        count++;
    }

    double calculateTotalPrice() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            if (products[i].UnitPrice < 1000) {
                total += products[i].UnitPrice + 1000;
            } else {
                total += products[i].UnitPrice;
            }
        }
        return total * Unit;
    }

    public Order(Customer c, int Unit) {
        this.c = c;
        this.Unit = Unit;
    }
}

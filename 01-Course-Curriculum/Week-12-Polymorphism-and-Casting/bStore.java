package Examples;

public class bStore {
    Object[] products = new Object[10];

    void addProduct(Object p) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = p;
                break;
            }
        }
    }

    void listProducts() {
        for (Object product : products) {
            if (product != null) {
                if (product instanceof bStationary)
                    ((bStationary) product).sayWhoIam();
                }else{
                    System.out.println("Not supported");
                }
            }
        }
    }

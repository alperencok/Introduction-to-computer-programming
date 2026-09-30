package Examples;

import java.util.ArrayList;

public class bFactory {
    String factoryName;
    cProduct products[] = new cProduct[5];
    ArrayList<aEmployee> employees = new ArrayList<>();

    void addProduct(cProduct p, int index) {
        if (index < products.length) {
            products[index] = p;
        } else {
            System.out.println("Index out of bound");
        }
    }

    /*void removeProduct(String title){
        for (Product product : products) {
            if(product!=null && product.title.equals(title)){
                product=null;
            }
        }
    }*/
    void removeProduct(int price) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].price > price) {
                products[i] = null;
            }
        }
    }

    void removeProduct(String title) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].title.equals(title)) {
                products[i] = null;
            }
        }
    }

    int getProductCount() {
        int count = 0;
        for (cProduct product : products) {
            if (product != null) {
                count++;
            }
        }
        return count;
    }

    int getProductTotalPrice() {
        int total = 0;
        for (cProduct product : products) {
            if (product != null) {
                total += product.price;
            }
        }
        return total;
    }

    void addEmployee(aEmployee e) {
        employees.add(e);
    }

    void removeEmployee(aEmployee e) {
        employees.remove(e);
    }

    int increaseProductPrice(String title, int inc) {
        int increment = 0;
        for (cProduct product: products) {
            if (product != null && product.title.equals(title)) {
                if (product.price < 5) {
                    product.price = product.price + inc + 2;
                    increment = increment + inc + 2;
                } else {
                    product.price = product.price + inc;
                    increment += inc;
                }
            }
        }
        return increment;
    }

}

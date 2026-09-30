package Examples;

public class fTest {
     public static void main(String[] args) {
        fProduct p=new fProduct();
        new fProduct();
        new fProduct();
        new fProduct();
        new fProduct();
        new fProduct();
        createProduct();
        createProduct();
        createProduct();

        fProducer producer=new fProducer();
        producer.createProduct();

        System.out.println(fProduct.count);

        System.out.println(fProduct.getNumberOfProduct());
    }

    static void createProduct(){
        new fProduct();
    }
}

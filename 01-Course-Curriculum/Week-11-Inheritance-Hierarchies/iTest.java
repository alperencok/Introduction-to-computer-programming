package Examples;

import java.util.Arrays;

public class iTest {
     public static void main(String[] args) {
        iProduct p=new iProduct("Pen 01");
        iProduct products[]={new iProduct("P1"),new iProduct("P2")};
       /* for (Product product : products) {
            System.out.println(product);
        }*/
        System.out.println(Arrays.toString(products));
      //  System.out.println(p.toString());
    }
}

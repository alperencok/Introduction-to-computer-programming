package Examples;
import java.util.ArrayList;
public class dTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        //Upcast
        list.add(1);
        list.add("John");
        list.add(3);
        list.add(3);
        int sum = 0;
        //downcast
        for (Object object : list) {
            if (object instanceof Integer) {
                sum += (Integer) object;
            }
        }
        System.out.println("Sum = "+sum);

    }
}

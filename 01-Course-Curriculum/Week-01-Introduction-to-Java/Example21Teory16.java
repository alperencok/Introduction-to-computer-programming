package Examples;

public class Example21Teory16 {
    public static void main(String[] args) {
        int i=5;
        System.out.println(i);
        {
            System.out.println(i);  //it works
            //char i=10; not allowed
        }
    }
    void aMethod(){
        //System.out.println(i); //not allowed
    }
}

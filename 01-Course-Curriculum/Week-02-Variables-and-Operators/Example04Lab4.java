package Examples;

public class Example04Lab4 {
    public static void main(String[] args) {
       int i=253;

       int a=i/100;
       System.out.println(a);

       int b=((i-((i/100)*100))/10);
       System.out.println(b);

       System.out.println(i%10);
    }
}

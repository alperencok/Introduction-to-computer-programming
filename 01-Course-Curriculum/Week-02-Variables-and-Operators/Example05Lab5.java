package Examples;

public class Example05Lab5 {
    public static void main(String[] args) {
        int i=351;

        int abc=i/100;
        System.out.println(abc);

        int b=((i-((i/100)*100))/10);
        System.out.println(b);

        int c=i-((i/10)*10);
        System.out.println(c);

        // Alternative solution
        // int i=351;
        // int digit100=i/100;
        // int digit1=i-(i/10)*10;
        // int digit10=(i-(digit100*100))/10;
        // int iReverse=100*digit1+10*digit10+digit100;
        // System.out.println(iReverse);
        // System.out.println(digit1+""+digit10+""+digit100);
    }
}

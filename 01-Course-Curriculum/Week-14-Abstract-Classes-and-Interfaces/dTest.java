package Examples;

public class dTest {
    public static void main(String[] args) {
        dIFilter evenFilter=new dIFilter() {
            @Override
            public boolean filter(int i) {
                return i%2==0;
            }
        };
        int [] numbers={1,2,6,5,8};
        showElement(numbers, evenFilter);
        dIFilter oddFilter=(n)->{return n%2==1;};
        showElement(numbers, oddFilter);

    }
    static void showElement(int [] number, dIFilter f){
        for (int i : number) {
            if (f.filter(i)){
                System.out.println(i);
            }
        }
    }
}

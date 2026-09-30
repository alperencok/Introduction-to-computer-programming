package Examples;

public class dExample11Teory7 {
    public static void main(String[] args) {
        System.out.println(getSum(1,2,3,4,5));
        int[] numbers={1,5,10};
        System.out.println(getSum(numbers));
        System.out.println(getSum());

    } // static int getSum(int a,int b){
    static int getSum(int... numbers){  //int[] numbers
        int sum=0;
        for(int i:numbers){
            System.out.println(i);
            sum+=i;
        }
        return sum;
        //return a+b;
    }
    static int getSum1(int n,int... numbers){  //int[] numbers
        int sum=0;   //(int... numbers,int n) olmaz
        for(int i:numbers){
            System.out.println(i);
            sum+=i;
        }
        return sum;
        //return a+b;
    }
}
//insert update delete crat

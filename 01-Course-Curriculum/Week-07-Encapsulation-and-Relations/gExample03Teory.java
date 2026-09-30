package Examples;

public class gExample03Teory {
    public static void main(String[] args) {
        int[] numbers=new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        numbers[0]=5;
        numbers[1]=15;
        numbers[2]=10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        //System.out.println(numbers[3]);
        //display elements of the array
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}

package Examples;

public class Example02Lab2 {
    public static void main(String[] args) {
        int counter=0;
        int number=7;
        while(number>0){
            int bit=number&1;
            if(bit==1)
                counter++;
            number=number>>1;
        }
        System.out.println(counter);
    }
}
//1010 & 0001 = 0000
//1010 >> 1   = 0101
//0101 & 0001 = 0001 -> counter=1
//0101 >> 1   = 0010
//0010 & 0001 = 0000
//0010 >> 1   = 0001
//0001 & 0001 = 0001 -> counter=2
//0001 >> 1   = 0000

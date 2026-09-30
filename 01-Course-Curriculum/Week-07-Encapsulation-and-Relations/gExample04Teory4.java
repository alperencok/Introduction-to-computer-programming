package Examples;

public class gExample04Teory4 {
    public static void main(String[] args) {
        //Get the sum of all elements in array
        int numbers[]={5,10,15};
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];
            System.out.println(i + ": " + numbers[i] + ": " + sum);
        }
        System.out.println(sum);
    }
}

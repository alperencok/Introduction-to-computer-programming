package Examples;

public class gExample06Teory6 {
    public static void main(String[] args) {
        //How many elements of an array can be divided by 3
        int numbers[]={1,9,10,15,20,30};
        int count=0;
        for(int element:numbers){
            if(element%3==0){
                count++;
            }
            System.out.println("Count: " + count);
        }
    }
}

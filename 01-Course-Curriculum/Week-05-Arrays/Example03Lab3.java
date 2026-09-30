package Examples;

public class Example03Lab3 {
    public static void main(String[] args) {
        int counter=0;
        int start=1;
        int stop=3;
        for(int i=start; i<=stop; i++){
            int nbr=i;
            while(nbr>0){
                int bit=nbr&1;
                if(bit==1)
                    counter++;
                nbr=nbr>>1;
            }
        }
        System.out.println(counter);
    }
}

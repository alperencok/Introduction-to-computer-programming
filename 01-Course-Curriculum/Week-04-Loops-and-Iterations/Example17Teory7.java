package Examples;

public class Example17Teory7 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    System.out.println("i:"+i+" j"+j+" k"+k);
                    if(k==5) return;
                // if you want you can delete return but it will try a lot
                }
            }
        }
    }
}

package Examples;

public class Example15Teory5 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
            System.out.println("Working 1");
            System.out.println("Working 2");
            System.out.println("Working 3");
        }
        System.out.println("-----");
        // equivalent
        // instead of continue
        for(int i=0; i<10; i++){
            if(i!=5){
            System.out.println(i);
            System.out.println("Working 1");
            System.out.println("Working 2");
            System.out.println("Working 3");
            }
        }
    }
}

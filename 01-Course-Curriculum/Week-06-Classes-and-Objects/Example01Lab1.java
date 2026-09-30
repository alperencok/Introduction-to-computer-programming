package Examples;

public class Example01Lab1 {
    public static void main(String[] args) {
        int number=56548306;
        boolean isContain3=false;
        while(number>0){
            System.out.println(number%10);
            if(number%10==3){
                isContain3=true;
                break;
            }
            number=number/10;
        }if(isContain3){
            System.out.println("There is 3");
        }else{
            System.out.println("There is no 3");
        }
    }
}

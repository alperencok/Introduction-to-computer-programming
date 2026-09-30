package Examples;

public class Example09Teory3 {
    public static void main(String[] args) {
        char target='a';
        boolean isContain=false;
        int start=97, stop=97;
        while(start<=stop){
            if((char)start==stop){
                isContain=true;
            }
            start++;
        }
        System.out.println(isContain);
    }
}

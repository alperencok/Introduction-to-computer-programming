package Examples;

public class iAnimal {
    int age;
    static String type;

    public iAnimal(int age) {
        this.age = age;
    }

    static int getAge() {
         //return age;  not possible
         return 0;
    }

    String getType(){
        return type;
    }
}

package Examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class sTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=new Scanner(new FileInputStream("c:\\files\\numbers.txt"));
        while(s.hasNextInt()){
            System.out.println(s.nextInt());
        }
    }
}
//Its not working because you do not have any files like this in your pc.

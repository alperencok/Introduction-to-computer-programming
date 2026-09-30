package Examples;

import java.util.Scanner;

public class Example008BM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the line:");
        String line = input.nextLine();

        char first_char = line.charAt(0);
        char last_char = line.charAt(line.length() - 1);

        int diff = 'a' - 'A';

        char uppercase_first_char = first_char;
        char uppercase_last_char = last_char;

        if (first_char >= 'a' && first_char <= 'z') {
            uppercase_first_char = (char)(first_char - diff);
        }if (last_char >= 'a' && last_char <= 'z') {
            uppercase_last_char = (char)(last_char - diff);
        }
        String middle_part = line.substring(1, line.length() - 1);
        String modifiedLine = uppercase_first_char
                + middle_part + uppercase_last_char;
        System.out.println(modifiedLine);
        }
}

import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String s){
        String reverse = "";
        char read;
        int lenght = s.length();

        for (int i = 0; i < lenght; lenght--) {
            reverse += s.charAt(lenght-1);
            System.out.println("String input: " + s);
            System.out.println("String build: " + reverse);
        }
        if (s.equalsIgnoreCase(reverse)){ return true; }
        else {return false;}
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        String name = "Abhima";
        name = name.toLowerCase();
        System.out.println(name);


        String text =" How are     you";
        text = text.replace( ' ','_');
        System.out.println(text);

        String letter = " Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","ABHIMA");
        System.out.println(letter);

    }
}
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


        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));


        String myletter = "Dear Harry,\n\t This Java course is nice. \n Thanks";
        System.out.println(myletter);

    }
}
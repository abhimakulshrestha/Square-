package com.company;
import java.util.Scanner;
public class Main{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value for a : ");
    int a = sc.nextInt();
    System.out.print("Enter value for b : ");
    int b = sc.nextInt();
    System.out.print("Enter value for c : ");
    int c = sc.nextInt();

    int max = a;

    if (b > max){
        max= b;
    }
    if (c > max){
        max = c ;
    }
    System.out.println("Max = "+ max);
}

        }
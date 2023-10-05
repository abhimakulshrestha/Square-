package com.company;
import java.util.Scanner;
 class Square {

         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();


     public void getSides() {
         System.out.println("length of sides of square = " +a+ " cm");

     }

     public int getArea() {
         int Area = a * a;
         System.out.println("Area of square = "+Area+" cm sq");
      return Area;
     }

     public int getPerimeter() {
         int Perimeter = 4 * a;
         System.out.println("Perimeter of square = "+Perimeter+ " cm");
         return Perimeter;
     }

     public static void main(String[] args) {
         Square Square1 = new Square();

         Square1.getSides();
         Square1.getArea();
         Square1.getPerimeter();
     }
 }










package Chisla;
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        System.out.println("введите стороны треугольника");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if ((a + b) > c & (a + c) > b & (c + b) > a) {
            if (a == b & a == c) ;
            System.out.println("треугольник равносторонний");
        } else if (a == b | a == c | b == c) {
            System.out.println("треугольник равнобедренный");
        } else {
            System.out.println("треугольеик разносторонний");

        }
    }
}


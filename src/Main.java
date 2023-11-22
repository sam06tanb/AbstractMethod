import entities.Circle;
import entities.Color;
import entities.Retangle;
import entities.SHAPE;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<SHAPE> list = new  ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + "data: ");
            System.out.print("Rectangle or Circle (r/c)?");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Retangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double Radius = sc.nextDouble();
                list.add(new Circle(color, Radius));
            }
        }


        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (SHAPE shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();

        }
    }

package Polygon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thong tin hcn");
        System.out.println("Nhap chieu dai hcn");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap chieu rong hcn");
        int witdh = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap thong tin hinh vuong");
        System.out.println("Nhap canh hv");
        int side = Integer.parseInt(scanner.nextLine());
        Rectangle rectangle = new Rectangle(length,witdh);
        Square square = new Square(side);

        System.out.println(rectangle);
        System.out.println(square);
    }
}

package Btvn8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh");
        int numberStudent = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberStudent; i++) {
            System.out.println("nhap ten hoc sinh");
            String name = scanner.nextLine();
            System.out.println("nhap tuoi hoc sinh");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap diem hoc sinh");
            double marks = Double.parseDouble(scanner.nextLine());
            Student student = new Student(name,age,marks);
            student.classify();
            student.display();
        }
    }
}

package techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong hoc vien");
        int n = Integer.parseInt(scanner.nextLine());
        ITStudent[] itstudents = new ITStudent[n];
        BizStudent[] bizStudents = new BizStudent[n];
        TechmasterStudent[] students = new TechmasterStudent[n];

        for (int i = 0; i < n; i++) {
                System.out.println("nhap ten hoc sinh");
                String name = scanner.nextLine();
                System.out.println("hay nhap kieu hoc vien (it hoac biz)");
                String  major = scanner.nextLine();
            if (major.equals("it")) {
                System.out.println("nhap diem marketing");
                int marketing = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap diem sales");
                int sales = Integer.parseInt(scanner.nextLine());
                ITStudent itStudent = new ITStudent(name,major,marketing,sales);
                itstudents[i] = itStudent;
                itStudent.printInfo();
            } else if (major.equals("biz")) {
                System.out.println("nhap diem java");
                int java = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap diem html");
                int html = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap diem css");
                int css = Integer.parseInt(scanner.nextLine());
                BizStudent bizStudent = new BizStudent(name,major,java,html,css);
                bizStudents[i] = bizStudent;
                System.out.println(bizStudent);
                bizStudent.printInfo();
            } else {
                System.out.println("nganh hoc khong dung");
            }
        }
    }
}

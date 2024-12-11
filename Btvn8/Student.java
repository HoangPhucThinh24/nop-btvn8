package Btvn8;

public class Student implements Iclassification {
    private String name;
    private int age;
    private double marks;
    private String classification;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public void classify() {
        if (marks >= 8) {
            classification= "A";
        } else if (marks > 6.5) {
            classification= "B";
        } else {
            classification= "C";
        }
    }

    @Override
    public void display() {
        System.out.println("ten: "+name);
        System.out.println("tuoi: "+age);
        System.out.println("diem: "+marks);
        System.out.println("xep loai: "+classification);
    }
}

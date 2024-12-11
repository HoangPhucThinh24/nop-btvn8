package techmaster;

public abstract class TechmasterStudent {
    private String name;
    private String major;

    public TechmasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public abstract double getScore();
    public void printInfo() {
        System.out.println("ten "+name);
        System.out.println("nganh "+major);
        System.out.println("hoc luc "+classify());
        System.out.println("diem "+getScore());
    }

    public String classify (){
        double score = getScore();
        if (score <5){
             return "yeu";
        } else if (score<6.5) {
            return "trung binh";
        } else if (score<8) {
            return "kha";
        } else {
            return "gioi";
        }
    }
}

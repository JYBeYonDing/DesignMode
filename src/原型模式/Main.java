package 原型模式;

public class Main {
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "23");
        a.setWorkExperience("2016", "百度");

        Resume b = a;
        Resume c = a;
        a.display();
    }
}

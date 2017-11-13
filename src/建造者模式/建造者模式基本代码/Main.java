package 建造者模式.建造者模式基本代码;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();

        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();
    }
}

package 建造者模式.建造者模式基本代码;

public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}

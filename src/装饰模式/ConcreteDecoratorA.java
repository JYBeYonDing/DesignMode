package 装饰模式;

public class ConcreteDecoratorA extends Decorator {
    private String adddedState; // 本类独有的功能

    @Override
    public void operation() {
        super.operation();
        adddedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }

}

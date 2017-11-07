package 装饰模式;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();

    }
    private void addedBehavior() {
        // 本来独有的方法，以区别于ConcreteDecoratorB
    }
}

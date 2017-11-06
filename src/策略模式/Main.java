package 策略模式;

public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
    }
}

package 策略模式;

/**
 * 用一个ConcreteStragegy来配置，维护一个对Strategy对象的引用
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 上下文接口
    public void ContextInterface() {
        strategy.algorithmInterface();
    }
}

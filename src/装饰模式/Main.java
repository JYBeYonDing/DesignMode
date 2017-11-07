package 装饰模式;

public class Main {

    public static void main(String[] args) {
//        Person xc = new Person("小菜");
//        System.out.println("第一种装扮");
//        Finery dtx = new TShirts();
//        dtx.show();
//        xc.show();

//        ConcreteComponent c = new ConcreteComponent();
//        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
//        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
//
//        d1.setComponent(c);
//        d2.setComponent(d1);
//        d2.operation();

        Person xc = new Person();
        System.out.println("第一种装扮");

        TShirts dtx = new TShirts();

        dtx.decorate(xc);

        dtx.show();
    }
}

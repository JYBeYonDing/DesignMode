package 外观模式.外观模式模板;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;

    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
    }

    public void methodA() {
        System.out.println("方法组A");
        one.methodOne();
        two.methodTwo();
    }

    public void methodB() {
        System.out.println("方法组B");
        two.methodTwo();
        one.methodOne();
    }
}

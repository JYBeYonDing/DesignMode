package 工厂方法模式.雷锋工厂;

public class Main {

    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
    }


}

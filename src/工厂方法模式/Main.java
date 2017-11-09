package 工厂方法模式;

public class Main {
    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.setNumberA(1);
        oper.setNumberB(2);

        double result = oper.getResult();
    }


}

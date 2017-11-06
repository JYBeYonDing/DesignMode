package 简单工厂;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA()-getNumberB();
        return result;
    }
}

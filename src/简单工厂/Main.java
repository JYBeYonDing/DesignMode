package 简单工厂;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberA = Double.parseDouble(sc.nextLine());
        String operate = sc.nextLine();
        Operation oper = OperationFactory.createOperate(operate);
        double numberB = Double.parseDouble(sc.nextLine());
        String result = "";
        oper.setNumberA(numberA);
        oper.setNumberB(numberB);
        result = Double.toString(oper.getResult());
        System.out.println(result);
    }
}
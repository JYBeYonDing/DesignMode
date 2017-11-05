import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberA = Double.parseDouble(sc.nextLine());
        String operate = sc.nextLine();
        double numberB = Double.parseDouble(sc.nextLine());
        String result = "";
        result = Double.toString(Operation.GetResult(numberA, numberB, operate));
        System.out.println(result);
    }
}
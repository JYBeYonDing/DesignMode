package 策略模式;

public class CashContext {
    private CashSuper cs = null;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            case "满300减100":
                CashReturn cr1 = new CashReturn(300,100);
                cs = cr1;
                break;
            case "打8折":
                CashRebate cr2 = new CashRebate("0.8");
                cs = cr2;
                break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}

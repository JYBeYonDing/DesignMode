package 外观模式;

public class Fund {
    Stock1 gu1;
    Stock2 gu2;

    public Fund() {
        this.gu1 = new Stock1();
        this.gu2 = new Stock2();
    }

    public void buyFund() {
        gu1.buy();
        gu2.buy();
    }

    public void sellFund() {
        gu1.sell();
        gu2.sell();
    }
}

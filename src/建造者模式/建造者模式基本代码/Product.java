package 建造者模式.建造者模式基本代码;

import java.util.ArrayList;

public class Product {
    // 产品部件
    ArrayList<String> parts = new ArrayList<>();

    /**
     * 添加产品部件
     * @param part
     */
    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品创建");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}

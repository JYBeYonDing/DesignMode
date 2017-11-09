package 原型模式.原型;

public class concretePrototype1 extends Prototype {
    public concretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return (Prototype) this.clone();
    }
}

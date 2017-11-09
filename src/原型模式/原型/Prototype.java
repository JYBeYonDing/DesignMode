package 原型模式.原型;

public abstract class Prototype {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String Id() {
        return id;
    }

    public abstract Prototype clone();

}
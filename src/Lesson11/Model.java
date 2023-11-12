package Lesson11;

public class Model {
    String name;
    int price;
    double engine;
    String color;

    public Model(String name, int price, double engine, String color) {
        this.name = name;
        this.price = price;
        this.engine = engine;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name=" + name +
                ", price=" + price +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}

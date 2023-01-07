package web.model;

public class Car {
    private String name;
    private int model;
    private String color;

    public Car(String name, int model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", web.model=" + model +
                ", color='" + color + '\'' +
                '}';
    }
}

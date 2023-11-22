package entities;

public abstract class SHAPE {
    private Color color;

    public SHAPE() {
    }

    public SHAPE(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}

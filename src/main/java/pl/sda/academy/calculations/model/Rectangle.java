package pl.sda.academy.calculations.model;

public class Rectangle {

    private final Integer width;
    private final Integer height;

    public Rectangle() {
        this.width = null;
        this.height = null;
    }

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getArea() {
        if (width == null || height == null) {
            return null;
        }

        return width * height;
    }
}

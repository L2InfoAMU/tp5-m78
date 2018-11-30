package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape{
    private int height;
    private int width;
    private Color color;
    private Point origin;

    Rectangle(int x, int y, int width, int height, Color color) {
        this.height = height;
        this.width = width;
        this.color = color;
        this.origin = new Point(x,y);
    }

    private boolean intIsInRange(int number, int lowerLimit, int higherLimit) {
        return ( lowerLimit <= number && number <= higherLimit);
    }

    public boolean contains(Point point) {
        return (intIsInRange(point.x,origin.x,origin.x+width) && intIsInRange(point.y,origin.y,origin.y+height));
    }

    public Color getColor() {
        return color;
    }
}

package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image {
    private int width;
    private int height;
    private List<Shape> shapes;

    VectorImage(List<Shape> shapes, int width, int height) {
        this.width=width;
        this.height= height;
        this.shapes = shapes;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        for(int i = 0 ; i < shapes.size() ; i++) {
            Shape shape = shapes.get(i);
            if(shape.contains(new Point(x,y))) return shape.getColor();
        }
        return Color.WHITE;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }
}

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
        //TODO explore chaque shape de la liste et s'arrete dès qu'elle rencontre une shape overlappant avec x et y puis renvoie la couleur de cette shape. renvoie blanc sinon
        return null;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    protected void setWidth(int width) { //TODO type int ?
        this.width = width;
    }

    protected void setHeight(int height) { //TODO type int ?
        this.height = height;
    }
}

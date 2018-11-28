package image;

import javafx.scene.paint.Color;

import static util.Matrices.*;
public class BruteRasterImage implements Image {
    private Color[][] pixels;
    private int width;
    private int height;

    //x = row number; y = column number
    public BruteRasterImage(Color color, int width, int height) {
        for(int x = 0 ; x < height ; x++) {
            for (int y = 0 ; y < width ; y++ ) {
                pixels[x][y] = color;
            }
        }
        this.width=width;
        this.height= height;
    }

    public BruteRasterImage(Color[][] colors) {
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        pixels = colors.clone();
        this.width = getColumnCount(colors);
        this.height = getRowCount(colors);
    }


    public void createRepresentation() {
        //TODO
    }

    public void setPixelColor(Color color, int x, int y) {
        pixels[x][y] = color;
    }

    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels) {
        //TODO
    }

    private void setPixelsColor(Color color) {
        //TODO
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    protected void setWidth(int width) {
        //TODO
    }

    protected void setHeight(int height) {
        //TODO
    }
}

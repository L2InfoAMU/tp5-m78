package image;

import javafx.scene.paint.Color;

import static util.Matrices.*;
public class BruteRasterImage implements Image {
    private Color[][] pixels;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height) {
        this.width=width;
        this.height= height;
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors) {
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        this.width = colors.length;
        this.height = colors[0].length;
        createRepresentation();
        setPixelsColor(colors);
    }


    public void createRepresentation() {
        pixels = new Color[width][height];
    }

    public void setPixelColor(Color color, int x, int y) {
        pixels[x][y] = color;
    }

    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    private void setPixelsColor(Color[][] pixels) {
        for (int x = 0 ; x < width ; x++) {
            for(int y = 0 ; y < height ; y++){
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    private void setPixelsColor(Color color) {
        for(int x = 0 ; x < width ; x++) {
            for (int y = 0 ; y < height ; y++ ) {
                setPixelColor(color, x, y);
            }
        }
    }

    public int getWidth() {
        return width;
    }

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

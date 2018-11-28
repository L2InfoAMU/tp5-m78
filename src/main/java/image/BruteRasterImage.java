package image;

import javafx.scene.paint.Color;

import static util.Matrices.requiresNonNull;
import static util.Matrices.requiresNonZeroDimensions;
import static util.Matrices.requiresRectangularMatrix;
public class BruteRasterImage implements Image {
    Color[][] pixels;

    //x = row number; y = column number
    public BruteRasterImage(Color color, int width, int height) {
        for(int x = 0 ; x < height ; x++) {
            for (int y = 0 ; y < width ; y++ ) {
                pixels[x][y] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors) {
        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);
        pixels = colors.clone();
    }


    public void createRepresentation() {
        //TODO
    }

    public void setPixelColor(Color color, int x, int y) {
        pixels[x][y] = color;
    }

    public Color getPixelColor(int x, int y) {
        //TODO
    }

    private void setPixelsColor(Color[][] pixels) {
        //TODO
    }

    private void setPixelsColor(Color color) {
        //TODO
    }

    public int getWidth() {
        //TODO
    }

    public int getHeight() {
        //TODO
    }

    protected void setWidth(int width) {
        //TODO
    }

    protected void setHeight(int height) {
        //TODO
    }
}

package image;

import javafx.scene.paint.Color;
import static util.Matrices.*;

public class BruteRasterImage extends RasterImage {
    private Color[][] pixels;

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


    private void createRepresentation() {
        pixels = new Color[width][height];
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        pixels[x][y] = color;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }
}

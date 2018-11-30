package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

import static util.Matrices.*;

public class SparseRasterImage extends RasterImage {
    private Map<Point,Color> pixelsMap;

    public SparseRasterImage(Color color, int width, int height) {
        this.width=width;
        this.height= height;
        createRepresentation();
        setPixelsColor(color);
    }

    public SparseRasterImage(Color[][] pixels) {
        requiresNonNull(pixels);
        requiresNonZeroDimensions(pixels);
        requiresRectangularMatrix(pixels);
        this.width = pixels.length;
        this.height = pixels[0].length;
        createRepresentation();
        setPixelsColor(pixels);
    }

    private void createRepresentation() {
        pixelsMap = new HashMap<>();
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        pixelsMap.put(new Point(x,y), color);
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixelsMap.get(new Point(x,y));
    }

    @Override
    void setPixelsColor(Color[][] pixels) {
        for (int x = 0 ; x < width ; x++) {
            for(int y = 0 ; y < height ;y ++){
                pixelsMap.put(new Point(x,y), pixels[x][y]);
            }
        }
    }

    @Override
    void setPixelsColor(Color color) {
        for (int x = 0 ; x < width ; x++) {
            for(int y = 0 ; y < height ;y ++){
                pixelsMap.put(new Point(x,y), color);
            }
        }
    }

}

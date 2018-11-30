package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image {
    List<Color> palette;
    int[][] indexesOfColors;
    int width;
    int height;

    public PaletteRasterImage(Color color, int width, int height) {
        this.width=width;
        this.height= height;
        createRepresentation();
        setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels) {
        setPixelsColor(pixels);
        this.width = indexesOfColors.length;
        this.height = indexesOfColors[0].length;
    }

    public void createRepresentation() {
        palette = new ArrayList<>();
        indexesOfColors = new int[width][height];
    }

    public void setPixelColor(Color color, int x, int y) {
        indexesOfColors[x][y] = palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int x = 0 ; x < width ; x++) {
            for(int y = 0 ; y < height ;y ++){
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    private void setPixelsColor(Color color) {
        for(int x = 0 ; x < width ; x++) {
            for (int y = 0 ; y < height ; y++ ) {
                indexesOfColors[x][y] = palette.indexOf(color);
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

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
        palette.add(color);
        setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels) {
        this.width = pixels.length;
        this.height = pixels[0].length;
        createRepresentation();
        addColorsToPalette(pixels);
        setPixelsColor(pixels);
    }

    private void addColorsToPalette(Color[][] pixels) {
    	for (int x = 0 ; x < width ; x++) {
		for(int y = 0 ; y < height ; y++) {
			if (!palette.contains(pixels[x][y])) palette.add(pixels[x][y]);
		}
	}	
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

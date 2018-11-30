package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage {
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
}

package image;

import javafx.scene.paint.Color;

public abstract class RasterImage implements Image {
    int width;
    int height;

    void setPixelsColor(Color[][] pixels) {
        for (int x = 0 ; x < width ; x++) {
            for(int y = 0 ; y < height ;y ++){
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    void setPixelsColor(Color color) {
        for(int x = 0 ; x < width ; x++) {
            for (int y = 0 ; y < height ; y++ ) {
                setPixelColor(color, x, y);
            }
        }
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

    public abstract void setPixelColor(Color color, int x, int y);
}

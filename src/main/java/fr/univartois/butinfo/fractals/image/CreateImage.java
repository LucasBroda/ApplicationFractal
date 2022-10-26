package fr.univartois.butinfo.fractals.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CreateImage implements IFractalImage{
    
    public BufferedImage image;
    
    public CreateImage(int width, int height) {
    	this.image = new BufferedImage(width,height,BufferedImage.TYPE_3BYTE_BGR);
    }

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public Pixel getPixel(int row, int column) {
		return new Pixel(this,row,column);
	}

	@Override
	public void setColor(int row, int column, Color color) {
		image.setRGB(row, column,color.getRGB());
	}

	@Override
	public void saveAs(String path) throws IOException {
		String[] splitted = path.split("\\.");
		String formatName = splitted[splitted.length - 1];
		ImageIO.write(image, formatName, new File(path));
	}
}

package Display.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader 
{
	public static BufferedImage loadImage(String path)//buffer in image from location of file(Resource Folder)
	{
		try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);//If image is not loaded game will stop 
		}
		return null;
	}
}

import java.awt.Color;

/**
 * An image filter to changes the picture to green.
 * 
 * @author Joseph Truelove
 * @version 12.9.2018
 */
public class HulkFilter extends Filter
{
    /**
     * Constructor for objects of class Solarize.
     * @param name The name of the filter.
     */
    public HulkFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int red = pix.getRed();
                int green = pix.getGreen();
                int blue = pix.getBlue();
                
                red = 0;
                blue = 0;
                
                image.setPixel(x, y, new Color(red, green, blue));
            }
        }
    }

}

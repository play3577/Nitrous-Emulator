package nitrous.lcd;

/**
 * A generic palette. Implementing classes include {@link DMGPalette} and {@link GBCPalette}.
 */
public interface IPalette
{
    /**
     * Gets the RGBA color associated to a given index.
     *
     * @param number The color index.
     * @return A color in RGBA format.
     */
    int getColor(int number);
}//end interface IPalette

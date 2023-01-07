// The purpose of this class is to model a television
// Ishrat Sikder Oct 26, 2021

public class Television 
{
    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    // constructor initializing attributes of class
    public Television(String brand, int sceenSize)
    {
        MANUFACTURER = brand;
        SCREEN_SIZE = sceenSize;
        powerOn = false;
        channel = 2;
        volume = 20;
    }

    /**
     * @param station station number
     */
    public void setChannel(int station)
    {
        channel = station;
    }

    /**
     * @return current display channel
     */
    public int getChannel()
    {
        return channel;
    }

    // toggle between power ON and OFF
    public void power()
    {
        powerOn = !powerOn;
    }

    // increment volume by 1
    public void increaseVolume()
    {
        volume+=1;
    }

    // decrement volume by 1
    public void decreaseVolume()
    {
        volume-=1;
    }

    /**
     * @return current volume
     */
    public int getVolume()
    {
        return volume;
    }

    /**
     * @return manufacture brand
     */
    public String getManufacturer()
    {
        return MANUFACTURER;
    }
    /**
     * @return tv screen size 
     */
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }
}

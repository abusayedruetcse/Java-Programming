package testtv;
public class TV {
    private int channel=1;
    private int volume=1;
    private boolean on=false;
    public TV()
    {
        
    }
    public void turnOn()
    {
        on=true;
    } 
    public void turnOff()
    {
        on=false;
    } 
    public void setChannel(int c)
    {
        if(on&&c>=1&&c<=120)
            channel=c;
    }
    public void setVolume(int v)
    {
        if(on&&v>=1&&v<=7)
            volume=v;
    }
    public void channelUp()
    {
        if(on&&channel<120)
        {
            channel++;
        }
    }
    public void channelDown()
    {
        if(on&&channel>1)
            channel--;
    }
    public void volumeUp()
    {
        if(on&&volume<7)
        {
            volume++;
        }
    } 
    public void volumeDown()
    {
        if(on&&volume>1)
        {
            volume--;
        }
        
    }
    public int getChannel()
    {
        return channel;
    }
    public int getVolume()
    {
        return volume;
    }
    
            
    
}

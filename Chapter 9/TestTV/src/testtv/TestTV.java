package testtv;

public class TestTV {
    public static void main(String[] args) {
       TV tv1=new TV();
       tv1.turnOn();
       tv1.setChannel(30);
       tv1.setVolume(3);
       
       TV tv2=new TV();
       tv2.turnOn();
       tv2.channelUp();
       tv2.channelUp();
       tv2.volumeUp();
       
       System.out.println("The first Channel: "+tv1.getChannel()+" and the volume: "+tv1.getVolume());
       System.out.println("The first Channel: "+tv2.getChannel()+" and the volume: "+tv2.getVolume());
    }
}

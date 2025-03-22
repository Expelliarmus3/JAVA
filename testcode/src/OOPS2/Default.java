package OOPS2;
interface Camera{
    void takeSnap();
    void recordVideo();
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void takeCall(){
        System.out.println("Connecting...");
    }

}
class SmartPhone extends CellPhone implements Wifi,Camera{
   public void takeSnap(){
        System.out.println("Taking Snap");
   }
    public void recordVideo(){
        System.out.println("Taking Snap");
    }
    public String[] getNetwork(){
        System.out.println("Getting lists of networks");
        String[] networkList= {"harry","Garry","Larry"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to"+network);
    }

}
public class Default {
}

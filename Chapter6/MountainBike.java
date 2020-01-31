package Chapter6;

public class MountainBike extends Bicycle {
    int frontShock,rearShock;

    public MountainBike(int frontShock,int rearShock){
        this.frontShock = frontShock;
        this.rearShock = rearShock;
    }
    double defaultTire(){
        return 2.1;
    }
}

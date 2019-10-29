package pbo_inheritance;
public class MountainTruck extends Truck {
    //the MountainTruck subclass adds one field
    public int seatHeight;
    //the MountainTruck subclass has one constructor
    public MountainTruck (int startHeight, int startCadence,
                         int startSpeed, int startGear)
    {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    //the MountainTruck subclass add one method 
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    
    public static void main(String[] args) {
        System.out.println("Mulai berjalan");
        MountainTruck MB = new MountainTruck (0,0,0,0);
        System.out.println("Gear    = "+MB.gear);
        System.out.println("Speed   = "+MB.speed);
        MB.setgear(2);
        MB.speedUp(2);
        System.out.println("Gear    = "+MB.gear);
        System.out.println("Speed   = "+MB.speed);
        MB.speedUp(2);
        System.out.println("Gear    = "+MB.gear);
        System.out.println("Speed   = "+MB.speed);
    }
}

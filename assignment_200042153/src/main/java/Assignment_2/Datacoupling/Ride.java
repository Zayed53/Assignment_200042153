package Assignment_2.Datacoupling;


public class Ride {
    public int person=2;
    public int distance=10;
    //data from vehicle class is used. Therefor it is datacoupling.
    public int rideprice(){
        Vehicle vehicle =new Vehicle();
        return vehicle.vehiclerentfare(person, distance);
    }


}

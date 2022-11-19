package Assignment_2.Stampcoupling;

public class Rent {
    public String user;

    //this fuction uses instance of another class as method parameter. Therefor Class Rent and house is data coupled
    public void rents(house House){
        if(House.isavailable){
            House.Owner=this.user;
        }
    }
}

package Assignment_2.ContentCoupling;

public class owner {
    //here owneradress changing directly an attribute of owner class. Therefor both class is Content coupled
    public void owneradress(String adress){
        Appartment appartment=new Appartment();
        appartment.location=adress;
    }
}
